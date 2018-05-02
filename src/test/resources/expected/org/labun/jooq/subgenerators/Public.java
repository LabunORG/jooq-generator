package org.labun.jooq.subgenerators;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
* This class is generated by jooq-generator.
*/
@Generated({"jooq-generator:"})
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Public extends SchemaImpl {

  /**
  * The reference instance of <code>PUBLIC</code>
  */
  public static final Public PUBLIC = new Public();

  /**
  * No further instances allowed
  */
  private Public() {
    super("PUBLIC", null);
  }

  /**
  * The table <code>PUBLIC.OWNERS</code>.
  */
  public final org.labun.jooq.subgenerators.table.OwnersTable OWNERS = org.labun.jooq.subgenerators.table.OwnersTable.OWNERS;

  /**
  * The table <code>PUBLIC.PETS</code>.
  */
  public final org.labun.jooq.subgenerators.table.PetsTable PETS = org.labun.jooq.subgenerators.table.PetsTable.PETS;

  /**
  * The table <code>PUBLIC.SPECIALTIES</code>.
  */
  public final org.labun.jooq.subgenerators.table.SpecialtiesTable SPECIALTIES = org.labun.jooq.subgenerators.table.SpecialtiesTable.SPECIALTIES;

  /**
  * The table <code>PUBLIC.TYPES</code>.
  */
  public final org.labun.jooq.subgenerators.table.TypesTable TYPES = org.labun.jooq.subgenerators.table.TypesTable.TYPES;

  /**
  * The table <code>PUBLIC.VETS</code>.
  */
  public final org.labun.jooq.subgenerators.table.VetsTable VETS = org.labun.jooq.subgenerators.table.VetsTable.VETS;

  /**
  * The table <code>PUBLIC.VET_SPECIALTIES</code>.
  */
  public final org.labun.jooq.subgenerators.table.VetSpecialtiesTable VET_SPECIALTIES = org.labun.jooq.subgenerators.table.VetSpecialtiesTable.VET_SPECIALTIES;

  /**
  * The table <code>PUBLIC.VISITS</code>.
  */
  public final org.labun.jooq.subgenerators.table.VisitsTable VISITS = org.labun.jooq.subgenerators.table.VisitsTable.VISITS;


  /**
  * {@inheritDoc}
  */
  @Override
  public Catalog getCatalog() {
    return org.labun.jooq.subgenerators.Catalog.INSTANCE;
  }

  @Override
  public final List<Sequence<?>> getSequences() {
    List result = new ArrayList();
    result.addAll(getSequences0());
    return result;
  }

  private final List<Sequence<?>> getSequences0() {
    return Arrays.<Sequence<?>>asList();
  }

  @Override
  public final List<Table<?>> getTables() {
    List result = new ArrayList();
    result.addAll(getTables0());
    return result;
  }

  private final List<Table<?>> getTables0() {
    return Arrays.<Table<?>>asList(OWNERS, PETS, SPECIALTIES, TYPES, VETS, VET_SPECIALTIES, VISITS);
  }
}
