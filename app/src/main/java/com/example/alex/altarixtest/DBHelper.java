package com.example.alex.altarixtest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Alex on 16.11.2016.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "noteDB";
    public static final String TABLE_NOTES = "notes";
    public static final String KEY_ID = "_id";
    public static final String KEY_HEAD = "head";
    public static final String KEY_TEXT = "text";
    public static final String KEY_PRIORITY = "priority";
    public static final String KEY_POSITION_LONGITUDE = "longitude";
    public static final String KEY_POSITION_LATITUDE = "latitude";
    public static final String KEY_PHOTO = "photo";


    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NOTES + "(" + KEY_ID + " INTEGER PRIMARY KEY, " + KEY_HEAD + " TEXT, " +
                KEY_TEXT + " TEXT, " + KEY_PRIORITY + " TEXT, " + KEY_POSITION_LONGITUDE + " TEXT, " +
                KEY_POSITION_LATITUDE + " TEXT, " + KEY_PHOTO + " TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NOTES);

        onCreate(db);
    }


}































