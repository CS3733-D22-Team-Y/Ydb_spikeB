package edu.wpi.YodelingYoshis;

import java.sql.*;

public class Main {

  public static void main(String[] args) {

    Database test = new Database("LocationDB");
    Connection db_conn = test.connection;

    LocationDataManager dm = new LocationDataManager(db_conn);
    dm.cleanTable("locations");

    Location location = new Location("boo", 5, 5, "1", "building", "node", "lN", "sN");
    Location loc1 = new Location("raw", 5, 5, "1", "building", "node", "lN", "sN");
    Location lo2 = new Location("foo", 5, 5, "1", "building", "node", "lN", "sN");
    Location lo3 = new Location("bar", 5, 5, "1", "building", "node", "lN", "sN");

    dm.addLocation(location);
    dm.addLocation(loc1);
    dm.addLocation(lo2);
    dm.addLocation(lo3);

    LocationManagerInterface locationManagerInterface = new LocationManagerInterface();
    locationManagerInterface.start();
    //    App.launch(App.class, args);
    test.shutdown_db();
  }
}
