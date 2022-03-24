package edu.wpi.YodelingYoshis;

import java.sql.*;

public class Main {

  public static void main(String[] args) {

    Database test = new Database("LocationDB");
    /*
    try {

      Object[] testParams = {
        "FDEPT001", 1617, 825, 1, "Tower", "DEPT", "Center for International Medicine", "CIM"
      };
      int success = test.insert("location", testParams);
      System.out.println("Insert = " + success);

    } catch (SQLException e) {
      System.out.println("error" + e.getMessage());
    }
    */
    App.launch(App.class, args);
  }
}
