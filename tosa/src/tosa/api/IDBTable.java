package tosa.api;

import java.util.Collection;

/**
 * An interface that represents a database table.
 *
 * ${License}
 */
public interface IDBTable {

  // TODO - AHK - Other attributes

  /**
   * Returns the IDatabase that this table is a part of.
   *
   * @return the IDatabase that this table is a part of
   */
  IDatabase getDatabase();

  /**
   * Returns the name of this table, as defined in the CREATE TABLE statement.  Note that
   * this name is considered to be case-sensitive.
   *
   * @return the name of this table
   */
  String getName();

  /**
   * Returns the IDBColumn with the given case-sensitive name, if any such column exists on this table.
   * The name is considered to be case-sensitive.
   *
   * @param name the name of the column
   * @return the IDBColumn with exactly the given name, or null if there is no such column
   */
  IDBColumn getColumn(String name);

  /**
   * Returns a Collection containing all of the columns on this table.  The returned collection is unmodifiable.
   *
   * @return a Collection of all IDBColumns on this table
   */
  Collection<? extends IDBColumn> getColumns();

  // TODO - AHK - Do we really need this?
  Collection<? extends IDBColumn> getIncomingFKs();

  /**
   * Indicates whether or not this table has an id column.  As a general rule, only join tables are allowed
   * to not have an id column.
   *
   * @return true if this table has an id column, false otherwise
   */
  boolean hasId();

  // TODO - AHK - Some attribute to indicate it's a join table?
}
