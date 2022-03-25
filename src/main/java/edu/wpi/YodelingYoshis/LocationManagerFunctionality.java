package edu.wpi.YodelingYoshis;

import java.util.ArrayList;

public class LocationManagerFunctionality {
  public static void displayNodes() {
    ArrayList<Location> locs = LocationDataManager.getLocations();

    for (Location l : locs) {
      System.out.println(
          l.nodeID
              + ": ("
              + l.xCoord
              + ", "
              + l.yCoord
              + "),"
              + l.building
              + " Floor "
              + l.floor
              + ". "
              + l.shortName
              + " ["
              + l.longName
              + "] "
              + l.nodeType);
    }
  }

  public static boolean replaceNodeVals(int ID, String floor, String locationType) {

    return false;
  }

  public static boolean newNode(int ID) {
    return false;
  }

  public static boolean deleteNode(int ID) {
    return false;
  }

  public static boolean writeDbToCSV() {
    return false;
  }
}
