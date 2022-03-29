package edu.wpi.YodelingYoshis;

public class Location extends DBObject {
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
    super("location");
    this.nodeID = nodeID;
    this.xCoord = xCoord;
    this.yCoord = yCoord;
    this.floor = floor;
    this.building = building;
    this.nodeType = nodeType;
    this.longName = longName;
    this.shortName = shortName;
  }

  public Location(String id) {
    super("location");
    nodeID = id;
    xCoord = 0;
    yCoord = 0;
    floor = "";
    building = "";
    nodeType = "";
    longName = "";
    shortName = "";
  }

  public String getKey() {
    return nodeID;
  }

  public String getInsertQuery(){
    return "VALUES("
            + "'"
            + this.nodeID
            + "'"
            + ", "
            + this.xCoord
            + ", "
            + this.yCoord
            + ", "
            + "'"
            + this.floor
            + "'"
            + ", "
            + "'"
            + this.building
            + "'"
            + ", "
            + "'"
            + this.nodeType
            + "'"
            + ", "
            + "'"
            + this.longName
            + "'"
            + ", "
            + "'"
            + this.shortName
            + "'"
            + ")";
  }

  public Location getClone() {
    return new Location(nodeID, xCoord, yCoord, floor, building, nodeType, longName, shortName);
  }
}
