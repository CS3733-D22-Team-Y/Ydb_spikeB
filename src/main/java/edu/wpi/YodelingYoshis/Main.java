package edu.wpi.YodelingYoshis;

import java.io.FileNotFoundException;

public class Main {

  public static void main(String[] args) {
    LocationManagerInterface locationManagerInterface = new LocationManagerInterface();
    locationManagerInterface.start();
    //    App.launch(App.class, args);
  }
}
