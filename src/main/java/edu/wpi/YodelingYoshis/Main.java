package edu.wpi.YodelingYoshis;

import java.sql.*;

public class Main {

  public static void main(String[] args) {

    Database test = new Database("LocationDB");
    Connection db_conn = test.connection;

    LocationDataManager dm = new LocationDataManager(db_conn);
    dm.cleanTable("locations");

    LocationManagerInterface locationManagerInterface = new LocationManagerInterface();
    locationManagerInterface.start();
    //    App.launch(App.class, args);
    test.shutdown_db();
  }
}
