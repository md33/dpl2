package com.androidbelieve.drawerwithswipetabs.db;

import android.content.Context;
import android.database.Cursor;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by md_moogii0306 on 4/23/2016.
 */
public class Model {
    private DataBaseHelper dbHelper = null;
    public Model(Context context) throws SQLException {
        dbHelper = new DataBaseHelper(context);
        try {
            dbHelper.createDataBase();
        } catch (IOException e) {
            throw new Error("Мэдээллийн сан үүсгэх боломжгүй байна");
        }
        dbHelper.openDataBase();
    }

    public Cursor chapter() {
        String query = "SELECT * FROM chapter";
        Cursor cursor = dbHelper.exec(query);
        if(cursor == null) {
            return null;
        }
        return cursor;
    }
    public Cursor title(){
        String query = "SELECT * FROM title";
        Cursor cursor = dbHelper.exec(query);
        if(cursor == null) {
            return null;
        }
        return cursor;
    }
}
