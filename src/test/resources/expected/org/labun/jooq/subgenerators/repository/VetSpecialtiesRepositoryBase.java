package org.labun.jooq.subgenerators.repository;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * This class is generated by jooq-generator.
*/
@Generated({"jooq-generator:"})
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class VetSpecialtiesRepositoryBase {
    protected final org.labun.jooq.subgenerators.table.VetSpecialtiesTable table = org.labun.jooq.subgenerators.table.VetSpecialtiesTable.VET_SPECIALTIES;
    protected final DSLContext jooq;
    private final Map<String, Field> pkFieldsMap;

    public VetSpecialtiesRepositoryBase(DSLContext dslContext) {
        this.jooq = dslContext;
        this.pkFieldsMap = getPKFieldsMap();
    }

    public boolean isFor(Table table) {
        return table != null && org.labun.jooq.subgenerators.table.VetSpecialtiesTable.class.isAssignableFrom(table.getClass());
    }

    public <RET> List<RET> findAll(Class<RET> clazz) {
        return jooq.selectFrom(table).fetchInto(clazz);
    }

    public int delete(Object entity) {
        Map<Field, Object> id = getId(entity);
        if (id.values().stream().anyMatch(it -> it == null))
            throw new IllegalStateException("Passed entity have not initialized id field(s)");

        return toRecord(entity).delete();
    }

    public int delete(Iterable<Object> entities) {
        if (entities == null) return 0;

        List<org.labun.jooq.subgenerators.record.VetSpecialtiesRecord> records = StreamSupport.stream(entities.spliterator(), false)
                .map(it -> toRecord(it))
                .collect(Collectors.toList());

        int[] result = jooq.batchDelete(records).execute();
        return Arrays.stream(result).sum();
    }

    public void deleteAll() {
        jooq.delete(table).execute();
    }

    public long count() {
        return jooq.selectCount().from(table).fetchOne(0, Long.class);
    }

    public <T> T save(T entity) {
        org.labun.jooq.subgenerators.record.VetSpecialtiesRecord record = toRecord(entity);
        record.store();
        return record.into(entity);
    }

    public <T> Iterable<T> save(Iterable<T> entities) {
        if (entities == null) return Collections.emptyList();

        List<org.labun.jooq.subgenerators.record.VetSpecialtiesRecord> records = StreamSupport.stream(entities.spliterator(), false)
                .map(it -> toRecord(it))
                .collect(Collectors.toList());

        jooq.batchStore(records).execute();

        return applyRecordsToEntities(entities, records);
    }

    private org.labun.jooq.subgenerators.record.VetSpecialtiesRecord toRecord(Object entity) {
        Map<Field, Object> id = getId(entity);
        if (id.values().stream().anyMatch(it -> it == null))
            return insertRecord(entity);
        return updateRecord(id, entity);
    }

    private org.labun.jooq.subgenerators.record.VetSpecialtiesRecord updateRecord(Map<Field, Object> id, Object entity) {
        return fetchLockedById(id)
                .map(it -> applyFrom(it, entity))
                .orElse(null);
    }

    private org.labun.jooq.subgenerators.record.VetSpecialtiesRecord applyFrom(org.labun.jooq.subgenerators.record.VetSpecialtiesRecord row, Object update) {
        row.from(update);
        return row;
    }

    private org.labun.jooq.subgenerators.record.VetSpecialtiesRecord insertRecord(Object entity) {
        return jooq.newRecord(table, entity);
    }

    private Map<String, Field> getPKFieldsMap() {
        return table.getPrimaryKey().getFields().stream()
                .collect(Collectors.toMap(it -> toCamelCase(it.getName()), it -> it));
    }

    private Map<Field, Object> getId(Object entity) {
        return Stream.of(entity.getClass().getDeclaredFields())
                .filter(it -> pkFieldsMap.containsKey(it.getName()))
                .collect(Collectors.toMap(it -> pkFieldsMap.get(it.getName()), it -> getFieldValue(entity, it)));
    }

    private String toCamelCase(String src) {
        return Arrays.stream(src.split("_"))
                .map(String::toLowerCase)
                .map(it -> capitalize(it))
                .collect(Collectors.joining(""));
    }

    private static String capitalize(String src) {
        if (src.length() == 0) return src;
        return Character.toUpperCase(src.charAt(0)) + src.substring(1);
    }

    private <V> V getFieldValue(Object entity, java.lang.reflect.Field field) {
        try {
            field.setAccessible(true);
            return (V) field.get(entity);
        } catch (Exception e) {
            throw new RepositoryException(e);
        }
    }

    private <T> List<T> applyRecordsToEntities(Iterable<T> entities, List<org.labun.jooq.subgenerators.record.VetSpecialtiesRecord> records) {
        List<T> result = new ArrayList<>();
        Iterator<T> entitiesIterator = entities.iterator();
        Iterator<org.labun.jooq.subgenerators.record.VetSpecialtiesRecord> recordsIterator = records.iterator();
        while (entitiesIterator.hasNext() && recordsIterator.hasNext()) {
            org.labun.jooq.subgenerators.record.VetSpecialtiesRecord record = recordsIterator.next();
            T entity = entitiesIterator.next();
            result.add(record.into(entity));
        }
        return result;
    }

    private List<TableField<org.labun.jooq.subgenerators.record.VetSpecialtiesRecord, ?>> pk() {
        UniqueKey<org.labun.jooq.subgenerators.record.VetSpecialtiesRecord> key = table.getPrimaryKey();
        if (key == null) throw new IllegalStateException("no pk found");
        return key.getFields();
    }

    protected Optional<org.labun.jooq.subgenerators.record.VetSpecialtiesRecord> fetchById(Map<Field, Object> id) {
        return buildCondition(id)
                .map(condition ->
                        jooq.selectFrom(table)
                                .where()
                                .fetchOne());
    }

    private Optional<Condition> buildCondition(Map<Field, Object> id) {
        return id.entrySet().stream()
                .map(e -> e.getKey().eq(e.getValue()))
                .reduce(Condition::and);
    }

    protected Optional<org.labun.jooq.subgenerators.record.VetSpecialtiesRecord> fetchLockedById(Map<Field, Object> id) {
        return buildCondition(id)
                .map(condition ->
                        jooq.selectFrom(table)
                                .where(condition)
                                .forUpdate()
                                .fetchOne());
    }

    public static class RepositoryException extends RuntimeException {
        public RepositoryException(Throwable cause) {
            super(cause);
        }
    }

}
