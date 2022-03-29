package edu.wpi.YodelingYoshis;

import org.sqlite.core.DB;

public abstract class DBObject {
    public String tableName;

    abstract String getKey();

    abstract String getInsertQuery();


    abstract DBObject getClone();

    public DBObject(String tableName) {
        this.tableName = tableName;
    }

//    abstract String getSQL();
}
