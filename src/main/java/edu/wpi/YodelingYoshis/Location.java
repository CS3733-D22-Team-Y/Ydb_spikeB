package edu.wpi.YodelingYoshis;

public class Location {
  String nodeID;
  int xCoord, yCoord;
  String floor;
  String building;
  String nodeType;
  String longName;
  String shortName;

  public Location(
      String nodeID,
      int xCoord,
      int yCoord,
      String floor,
      String building,
      String nodeType,
      String longName,
      String shortName) {
    this.nodeID = nodeID;
    this.xCoord = xCoord;
    this.yCoord = yCoord;
    this.floor = floor;
    this.building = building;
    this.nodeType = nodeType;
    this.longName = longName;
    this.shortName = shortName;
  }
}
