package edu.wpi.YodelingYoshis;

import java.sql.*;

public class Database {
  // DB connection
  protected Connection connection;
  protected Query query;

  public Database(String db_name) {
    try {
      Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
    } catch (ClassNotFoundException e) {
      System.out.println("Apache Derby Driver Not found!");
      e.printStackTrace();
      return;
    }

    try {
      connection = DriverManager.getConnection("jdbc:derby:" + db_name);
      /*
      Statement stmt = connection.createStatement();
      String sql =
          "CREATE TABLE location (nodeID VARCHAR(25), xcoord INT, ycoord INT, floor INT, building VARCHAR(25), nodeType VARCHAR(25), longName VARCHAR(255), shortName VARCHAR(50))";
      stmt.executeUpdate(sql);
      System.out.println("Created tabled named " + tableName);
      */
    } catch (SQLException e) {
      System.out.println("Connection Failed");
      e.printStackTrace();
      return;
    }

    System.out.println("Connection Successful");
  }

  /**
   * @param query sql query
   * @param params any number of params of different types
   * @return number of rows affected by query
   * @throws SQLException
   */
  private int query(String query, Object[] params) throws SQLException {
    PreparedStatement ps = connection.prepareStatement(query);
    if (params != null) {
      int index = 1;
      for (Object param : params) {
        ps.setObject(index, param);
        index++;
      }
    }
    return ps.executeUpdate();
  }

  /**
   * Deletes data from inputted table
   * @param tableName name of table
   * @param cond name of col structured like: "colname=?'
   * @param params name of identifier
   * @return object reference to query
   * @throws SQLException
   */
  public int delete(String tableName, String cond, Object[] params) throws SQLException {
    query = new Query();
    query.delete(tableName).where(cond);

    return query(query.getQuery(), params);
  }

  /**
   * @param tableName name of table to insert into
   * @param params list of params to add format = {arg1, arg2,..., argN}
   * @return object reference
   * @throws SQLException
   */
  public int insert(String tableName, Object[] params) throws SQLException {
    query = new Query();
    query.insert(tableName).values(params);

    return query(query.getQuery(), params);
  }

  /**
   * @param tableName name of the table
   * @param cols cols to update: format = {col1, col2,...,colN}"
   * @param cond identifier for updating: format "identier=?"
   * @param params List of updated terms: format = {one, two,..., N};
   * @return object reference
   * @throws SQLException
   */
  public int update(String tableName, String[] cols, String cond, Object[] params)
      throws SQLException {
    query = new Query();
    query.update(tableName).set(cols).where(cond);

    return query(query.getQuery(), params);
  }

  //TODO NEED SOMETHING TO RETRIEVE FROM DB

}
