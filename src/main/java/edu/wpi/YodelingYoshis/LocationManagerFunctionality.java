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
    Location toChange = LocationDataManager.getLocationCopy(ID);
    if (toChange == null) {
      System.out.println("Could not get Node " + ID + " for replacement.");
      return false;
    }

    toChange.floor = floor;
    toChange.nodeType = locationType;
    return LocationDataManager.replaceLocation(ID, toChange);
  }

  public static boolean newNode(String ID) {
    Location newLoc = new Location(ID);
    return LocationDataManager.addLocation(newLoc);
  }

  public static boolean deleteNode(String ID) {
    return LocationDataManager.removeLocation(ID);
  }

  public static boolean writeDbToCSV(String fileLoc) {
    try {
      Locations2CSV.generateCSV(fileLoc);
    } catch (Exception e) {
      System.out.println("CSV generation failed. See below:");
      e.printStackTrace();
      return false;
    }

    return true;
  }
}
