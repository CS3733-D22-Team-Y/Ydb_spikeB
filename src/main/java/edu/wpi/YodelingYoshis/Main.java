package edu.wpi.YodelingYoshis;

import java.io.FileNotFoundException;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    // System.out.println("yest");

    ReadIn thisRead = new ReadIn();
    thisRead.readCSV();

    System.out.println("completed");
    // App.launch(App.class, args);
  }
}
