package edu.wpi.YodelingYoshis;

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
