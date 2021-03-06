package org.labun.jooq.subgenerators.record;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record${table.primaryKey.columns.size()};
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

/**
* This class is generated by jooq-generator.
*/
@Generated({"jooq-generator:"})
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class VetSpecialtiesRecord extends UpdatableRecordImpl<VetSpecialtiesRecord> implements Record2<java.lang.Integer, java.lang.Integer> {


  /**
  * Setter for <code>PUBLIC.VET_SPECIALTIES.VET_ID</code>
  */
  public VetSpecialtiesRecord vetId(java.lang.Integer value) {
    set(0, value);
    return this;
  }

  /**
  * Getter for <code>PUBLIC.VET_SPECIALTIES.VET_ID</code>.
  */
  public java.lang.Integer vetId() {
    return (java.lang.Integer) get(0);
  }

  /**
  * Setter for <code>PUBLIC.VET_SPECIALTIES.SPECIALTY_ID</code>
  */
  public VetSpecialtiesRecord specialtyId(java.lang.Integer value) {
    set(1, value);
    return this;
  }

  /**
  * Getter for <code>PUBLIC.VET_SPECIALTIES.SPECIALTY_ID</code>.
  */
  public java.lang.Integer specialtyId() {
    return (java.lang.Integer) get(1);
  }


  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
  * {@inheritDoc}
  */
  @Override
  public Record${table.primaryKey.columns.size()}<> key() {
    return (Record${table.primaryKey.columns.size()}) super.key();
  }

  // -------------------------------------------------------------------------
  // Record2 type implementation
  // -------------------------------------------------------------------------

  /**
  * {@inheritDoc}
  */
  @Override
  public Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
    return (Row2) super.fieldsRow();
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
    return (Row2) super.valuesRow();
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public Field<java.lang.Integer> field1() {
    return org.labun.jooq.subgenerators.table.VetSpecialtiesTable.VET_SPECIALTIES.VET_ID;
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public Field<java.lang.Integer> field2() {
    return org.labun.jooq.subgenerators.table.VetSpecialtiesTable.VET_SPECIALTIES.SPECIALTY_ID;
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public java.lang.Integer component1() {
    return vetId();
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public java.lang.Integer component2() {
    return specialtyId();
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public java.lang.Integer value1() {
    return vetId();
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public java.lang.Integer value2() {
    return specialtyId();
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public VetSpecialtiesRecord value1(java.lang.Integer value) {
    vetId(value);
    return this;
  }
  /**
  * {@inheritDoc}
  */
  @Override
  public VetSpecialtiesRecord value2(java.lang.Integer value) {
    specialtyId(value);
    return this;
  }

  /**
  * {@inheritDoc}
  */
  @Override
  public VetSpecialtiesRecord values(java.lang.Integer value1, java.lang.Integer value2) {
    value1(value1);
    value2(value2);
    return this;
  }


  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
  * Create a detached VetSpecialtiesRecord
  */
  public VetSpecialtiesRecord() {
    super(org.labun.jooq.subgenerators.table.VetSpecialtiesTable.VET_SPECIALTIES);
  }

  /**
  * Create a detached, initialised VetSpecialtiesRecord
  */
  public VetSpecialtiesRecord(java.lang.Integer value1, java.lang.Integer value2) {
    super(org.labun.jooq.subgenerators.table.VetSpecialtiesTable.VET_SPECIALTIES);

    set(0, value1);
    set(1, value2);
  }
}
