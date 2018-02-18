package org.labun.jooq.generator;

import lombok.SneakyThrows;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.jooq.tools.JooqLogger;
import org.jooq.util.Database;
import org.jooq.util.Definition;
import org.jooq.util.SchemaDefinition;
import org.jooq.util.TableDefinition;
import org.labun.jooq.generator.config.CodeGenerationConfig;
import org.labun.jooq.generator.config.Configuration;
import org.labun.jooq.generator.config.Defaults;
import org.labun.jooq.generator.task.CodeGenerationTask;
import org.labun.jooq.generator.task.TaskContext;
import org.labun.jooq.generator.util.FilePathResolver;
import org.labun.jooq.generator.util.InstatiatorService;
import org.labun.jooq.generator.util.NameCreator;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Konstantin Labun
 */
public class DefaultGenerator implements Generator {
    private static final JooqLogger LOG = JooqLogger.getLogger(DefaultGenerator.class);

    protected Configuration configuration;
    protected List<CodeGenerationTask> codeGenerationTasks;
    protected InstatiatorService instatiatorService;
    protected GeneratorContext generatorContext;

    public DefaultGenerator() {
        this(null);
    }

    public DefaultGenerator(Configuration configuration) {
        this.generatorContext = new GeneratorContext();
        this.configuration = configuration != null ? configuration : Defaults.configuration();
        this.instatiatorService = new InstatiatorService(configuration);
        this.codeGenerationTasks = configuration.codeGeneration().stream()
                .map(codeGenerationConfig -> createCodeGenerationTask(configuration, codeGenerationConfig))
                .collect(Collectors.toList());
    }

    @SneakyThrows
    private CodeGenerationTask createCodeGenerationTask(Configuration cfg, CodeGenerationConfig generatorConfig) {
        NameCreator nameCreator = instatiatorService.createOrGetInstance(generatorConfig.nameCreator());
        TaskContext generationTaskContext = new TaskContext()
                .generatorContext(generatorContext)
                .config(generatorConfig)
                .nameCreator(nameCreator)
                .sqlTypeResolver(instatiatorService.createOrGetInstance(generatorConfig.sqlTypeResolver()))
                .javaTypeResolver(instatiatorService.createOrGetInstance(generatorConfig.javaTypeResolver()))
                .filePathResolver(new FilePathResolver(generatorConfig));

        generatorContext.taskContexts().add(generationTaskContext);

        return createCodeGenerationTask(generatorConfig, generationTaskContext);
    }

    private CodeGenerationTask createCodeGenerationTask(CodeGenerationConfig generatorConfig, TaskContext generationTaskContext) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> codeGenTaskClazz = Class.forName(generatorConfig.codeGenerationTask());
        Constructor<?> constructor = codeGenTaskClazz.getConstructor(TaskContext.class);
        return (CodeGenerationTask) constructor.newInstance(generationTaskContext);
    }

    public void generate(Database db) {
        Velocity.setProperty(RuntimeConstants.RESOURCE_LOADER, "class");
        Velocity.setProperty("class.resource.loader.class", ClasspathResourceLoader.class.getCanonicalName());
        Velocity.init();

        getTargetSchemas(db).stream()
                // run schema tasks
                .peek(schema -> tasksBySupportedType(SchemaDefinition.class)
                        .forEach(task -> task.generate(schema)))
                .flatMap(schema -> schema.getTables().stream())
                // run table tasks
                .forEach(table -> tasksBySupportedType(TableDefinition.class)
                        .forEach(task -> task.generate(table)));
    }

    @Override
    public Configuration configuration() {
        return configuration;
    }

    @SuppressWarnings("unchecked")
    private List<CodeGenerationTask> tasksBySupportedType(Class<? extends Definition> type) {
        return codeGenerationTasks.stream()
                .filter(it -> it.support(type))
                .collect(Collectors.toList());
    }

    private List<SchemaDefinition> getTargetSchemas(Database db) {
        return db.getSchemata().stream()
                .filter(it -> configuration.database().schemas().contains(it.getName()))
                .collect(Collectors.toList());
    }

}