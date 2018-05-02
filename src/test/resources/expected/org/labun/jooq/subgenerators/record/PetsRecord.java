package org.labun.jooq.subgenerators.record;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

/**
* This class is generated by jooq-generator.
*/
@Generated({"jooq-generator:"})
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class PetsRecord extends UpdatableRecordImpl<PetsRecord> implements Record5<java.lang.Integer, java.lang.String, java.time.LocalDate, java.lang.Integer, java.lang.Integer> {


  /**
  * Setter for <code>PUBLIC.PETS.ID</code>
  */
  public PetsRecord id(java.lang.Integer value) {
    set(0, value);
    return this;
  }

  /**
  * Getter for <code>PUBLIC.PETS.ID</code>.
  */
  public java.lang.Integer id() {
    return (java.lang.Integer) get(0);
  }

  /**
  * Setter for <code>PUBLIC.PETS.NAME</code>
  */
  public PetsRecord name(java.lang.String value) {
    set(1, value);
    return this;
  }

  /**
  * Getter for <code>PUBLIC.PETS.NAME</code>.
  */
  public java.lang.String name() {
    return (java.lang.String) get(1);
  }

  /**
  * Setter for <code>PUBLIC.PETS.BIRTH_DATE</code>
  */
  public PetsRecord birthDate(java.time.LocalDate value) {
    set(2, value);
    return this;
  }

  /**
  * Getter for <code>PUBLIC.PETS.BIRTH_DATE</code>.
  */
  public java.time.LocalDate birthDate() {
    return (java.time.LocalDate) get(2);
  }

  /**
  * Setter for <code>PUBLIC.PETS.TYPE_ID</code>
  */
  public PetsRecord typeId(java.lang.Integer value) {
    set(3, value);
    return this;
  }

  /**
  * Getter for <code>PUBLIC.PETS.TYPE_ID</code>.
  */
  public java.lang.Integer typeId() {
    return (java.lang.Integer) get(3);
  }

  /**
  * Setter for <code>PUBLIC.PETS.OWNER_ID</code>
  */
  public PetsRecord ownerId(java.lang.Integer value) {
    set(4, value);
    return this;
  }

  /**
  * Getter for <code>PUBLIC.PETS.OWNER_ID</code>.
  */
  public java.lang.Integer ownerId() {
    return (java.lang.Integer) get(4);
  }


  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
  * {@inheritDoc}
  */
  @Override
  public Record1<java.lang.Integer> key() {
    return (Record1) super.key();
  }

  // -------------------------------------------------------------------------
  // Record5 type implementation
  // -------------------------------------------------------------------------

  /**
  * {@inheritDoc}
  */
  @Override
  public Row5<java.lang.Integer, java.lang.String, java.time.LocalDate, java.lang.Integer, java.lang.Integer> fieldsRow() {
    return (Row5) super.fieldsRow();
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public Row5<java.lang.Integer, java.lang.String, java.time.LocalDate, java.lang.Integer, java.lang.Integer> valuesRow() {
    return (Row5) super.valuesRow();
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public Field<java.lang.Integer> field1() {
    return org.labun.jooq.subgenerators.table.PetsTable.PETS.ID;
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public Field<java.lang.String> field2() {
    return org.labun.jooq.subgenerators.table.PetsTable.PETS.NAME;
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public Field<java.time.LocalDate> field3() {
    return org.labun.jooq.subgenerators.table.PetsTable.PETS.BIRTH_DATE;
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public Field<java.lang.Integer> field4() {
    return org.labun.jooq.subgenerators.table.PetsTable.PETS.TYPE_ID;
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public Field<java.lang.Integer> field5() {
    return org.labun.jooq.subgenerators.table.PetsTable.PETS.OWNER_ID;
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public java.lang.Integer component1() {
    return id();
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public java.lang.String component2() {
    return name();
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public java.time.LocalDate component3() {
    return birthDate();
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public java.lang.Integer component4() {
    return typeId();
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public java.lang.Integer component5() {
    return ownerId();
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public java.lang.Integer value1() {
    return id();
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public java.lang.String value2() {
    return name();
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public java.time.LocalDate value3() {
    return birthDate();
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public java.lang.Integer value4() {
    return typeId();
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public java.lang.Integer value5() {
    return ownerId();
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public PetsRecord value1(java.lang.Integer value) {
    id(value);
    return this;
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public PetsRecord value2(java.lang.String value) {
    name(value);
    return this;
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public PetsRecord value3(java.time.LocalDate value) {
    birthDate(value);
    return this;
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public PetsRecord value4(java.lang.Integer value) {
    typeId(value);
    return this;
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public PetsRecord value5(java.lang.Integer value) {
    ownerId(value);
    return this;
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public PetsRecord values(java.lang.Integer value1, java.lang.String value2, java.time.LocalDate value3, java.lang.Integer value4, java.lang.Integer value5) {
    value1(value1);
    value2(value2);
    value3(value3);
    value4(value4);
    value5(value5);
    return this;
  }


  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
  * Create a detached PetsRecord
  */
  public PetsRecord() {
    super(org.labun.jooq.subgenerators.table.PetsTable.PETS);
  }

  /**
  * Create a detached, initialised PetsRecord
  */
  public PetsRecord(java.lang.Integer value1, java.lang.String value2, java.time.LocalDate value3, java.lang.Integer value4, java.lang.Integer value5) {
    super(org.labun.jooq.subgenerators.table.PetsTable.PETS);

    set(0, value1);
    set(1, value2);
    set(2, value3);
    set(3, value4);
    set(4, value5);
  }
}
