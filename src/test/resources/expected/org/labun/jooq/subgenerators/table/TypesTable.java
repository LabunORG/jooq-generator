package org.labun.jooq.subgenerators.table;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
* This class is generated by jooq-generator.
*/
@Generated({"jooq-generator:"})
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TypesTable extends TableImpl<org.labun.jooq.subgenerators.record.TypesRecord> {

/**
* The reference instance of <code>PUBLIC.TYPES</code>
*/
public static final TypesTable TYPES = new TypesTable();

  /**
  * The class holding records for this type
  */
  @Override
  public Class<org.labun.jooq.subgenerators.record.TypesRecord> getRecordType() {
    return org.labun.jooq.subgenerators.record.TypesRecord.class;
  }

  /**
  * Create an aliased <code>PUBLIC.TYPES</code> table reference
  */
  public TypesTable() {
    this(DSL.name("TYPES"), null);
  }

  /**
  * Create an aliased <code>PUBLIC.TYPES</code> table reference
  */
  public TypesTable(String alias) {
    this(DSL.name(alias), TYPES);
  }

  /**
  * Create an aliased <code>PUBLIC.TYPES</code> table reference
  */
  public TypesTable(Name alias) {
    this(alias, TYPES);
  }

  private TypesTable(Name alias, Table<org.labun.jooq.subgenerators.record.TypesRecord> aliased) {
    this(alias, aliased, null);
  }

  private TypesTable(Name alias, Table<org.labun.jooq.subgenerators.record.TypesRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, "");
  }

  /**
  * The column <code>PUBLIC.TYPES.ID</code>.
  */
  public final TableField<org.labun.jooq.subgenerators.record.TypesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

  /**
  * The column <code>PUBLIC.TYPES.NAME</code>.
  */
  public final TableField<org.labun.jooq.subgenerators.record.TypesRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");


  /**
  * {@inheritDoc}
  */
  @Override
  public Schema getSchema() {
    return org.labun.jooq.subgenerators.Public.PUBLIC;
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public TypesTable as(String alias) {
    return new TypesTable(DSL.name(alias), this);
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public TypesTable as(Name alias) {
    return new TypesTable(alias, this);
  }

  /**
  * Rename this table
  */
  @Override
  public TypesTable rename(String name) {
    return new TypesTable(DSL.name(name), null);
  }

  /**
  * Rename this table
  */
  @Override
  public TypesTable rename(Name name) {
    return new TypesTable(name, null);
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public List<Index> getIndexes() {
    return Arrays.<Index>asList(org.labun.jooq.subgenerators.PublicIndexes.INDEX_4C, org.labun.jooq.subgenerators.PublicIndexes.PRIMARY_KEY_4C);
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public Identity<org.labun.jooq.subgenerators.record.TypesRecord, java.lang.Integer> getIdentity() {
    return org.labun.jooq.subgenerators.PublicKeys.IDENTITY_TYPES;
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public UniqueKey<org.labun.jooq.subgenerators.record.TypesRecord> getPrimaryKey() {
    return org.labun.jooq.subgenerators.PublicKeys.CONSTRAINT_4C;
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public List<UniqueKey<org.labun.jooq.subgenerators.record.TypesRecord>> getKeys() {
    return Arrays.<UniqueKey<org.labun.jooq.subgenerators.record.TypesRecord>>asList(org.labun.jooq.subgenerators.PublicKeys.CONSTRAINT_4C);
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public List<ForeignKey<org.labun.jooq.subgenerators.record.TypesRecord, ?>> getReferences() {
    return Arrays.<ForeignKey<org.labun.jooq.subgenerators.record.TypesRecord, ?>>asList();
  }
}