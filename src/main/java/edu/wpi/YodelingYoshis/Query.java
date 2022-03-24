package edu.wpi.YodelingYoshis;

// Adapted from https://www.ictdemy.com/java/jdbc/database-wrapper-in-java-creating-the-query-class

public class Query {
  // Allows for easily appending to query string.
  private StringBuilder query;

  /**
   * To string
   *
   * @return
   */
  public String getQuery() {
    return query.toString();
  }

  /**
   * Begin delete query
   *
   * @param tableName
   * @return object reference
   */
  public Query delete(String tableName) {
    query = new StringBuilder();
    query.append("DELETE FROM ");
    query.append(tableName);
    return this;
  }

  /**
   * Allows for WHERE implementation
   *
   * @param condition allows for SQL valid condiitons
   * @return object reference
   */
  public Query where(String condition) {
    query.append("WHERE ");
    query.append(condition);
    return this;
  }

  /**
   * Allows for FROM implementation
   *
   * @param tableName name of DB table
   * @return object reference
   */
  public Query from(String tableName) {
    query.append("FROM ");
    query.append(tableName);
    return this;
  }

  /**
   * Allows for UPDATE implementation with SET keyword
   *
   * @param tableName name of table to update.
   * @return object reference
   */
  public Query update(String tableName) {
    query = new StringBuilder();
    query.append("UPDATE ");
    query.append(tableName);
    query.append(" SET ");
    return this;
  }

  /**
   * Adds implementation for SET with multiple columns
   *
   * @param String array of columns to edit.
   * @return object refrence
   */
  public Query set(String[] cols) {
    for (String col : cols) {
      query.append(col);
      query.append(" = ");
      query.append("?");
      query.append(",");
    }
    // Will remove last ',' char to ensure proper execution.
    query.deleteCharAt(query.lastIndexOf(","));
    return this;
  }

  /**
   * Allows for inserting into @tableName
   *
   * @param tableName name of table to insert into
   * @return object reference
   */
  public Query insert(String tableName) {
    query = new StringBuilder();
    query.append("INSERT INTO ");
    query.append(tableName);
    return this;
  }

  /**
   * allows for VALUES input
   *
   * @param vals array of objects to be passed in as vals.
   * @return object reference
   */
  public Query values(Object[] vals) {
    query.append(" VALUES(");

    if (vals.length == 0) {
      throw new IllegalArgumentException("Incorrect value count");
    }

    for (int i = 0; i < vals.length; i++) {
      query.append("?, ");
    }
    query.deleteCharAt(query.lastIndexOf(","));
    query.append(")");
    return this;
  }

  public Query select(Object[] cols) {
    query = new StringBuilder();
    query.append("SELECT ");
    if (cols != null) {
      for (Object col : cols) {
        query.append(col);
        query.append(",");
      }
      query.deleteCharAt(query.lastIndexOf(","));
    } else {
      query.append("*");
    }
    return this;
  }
}
