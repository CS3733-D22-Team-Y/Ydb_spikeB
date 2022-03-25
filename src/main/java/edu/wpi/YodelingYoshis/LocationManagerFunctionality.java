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

  public static boolean replaceNodeVals(String ID, String floor, String locationType) {

    return false;
  }

  public static boolean newNode(String ID) {
    Location newLoc = new Location(ID);
    LocationDataManager.addLocation(newLoc);

    return false;
  }

  public static boolean deleteNode(String ID) {

    return false;
  }

  public static boolean writeDbToCSV(String fileLoc) {

    return false;
  }
}
