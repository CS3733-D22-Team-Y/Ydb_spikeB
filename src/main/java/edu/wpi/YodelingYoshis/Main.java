package edu.wpi.YodelingYoshis;

import java.io.FileNotFoundException;

public class Main {

  public static void main(String[] args) {

    Database test = new Database("LocationDB");
    // do db stuff

    test.shutdown_db();
    
    LocationManagerInterface locationManagerInterface = new LocationManagerInterface();
    locationManagerInterface.start();
    //    App.launch(App.class, args);
  }
}
