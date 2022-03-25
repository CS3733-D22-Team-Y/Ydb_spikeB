package edu.wpi.YodelingYoshis;

public class Main {

  public static void main(String[] args) {

    Database test = new Database("LocationDB");
    test.shutdown_db();
    /*
    String sql =
        "INSERT INTO location VALUES(\"FDEPT00101\", 1617, 825, 1, \"Tower\", \"DEPT\", \"Center for International Medicine\",  \"CIM\")";
    test.execute_cmd(sql);
    */
    App.launch(App.class, args);
  }
}
