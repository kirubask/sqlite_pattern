package com.example.databasehelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelperClass extends SQLiteOpenHelper {

    static final String DATABASE_NAME = "MY_DATA.DB";//databasename and version
    static final int DATABASE_VERSION = 1 ;

    static final String DATABASE_TABLE="USERS"; //creating the table for database in rows and coloumns
    static final String USER_ID = "_ID";
    static final String USER_NAME="user_name";
    static final String USER_PASSWORD="password";


//GIVING NAME TO ROWS AND COLUMN FOR COLLECTINBG THE DATA
private static final String CRETAE_DB_QUERY = " CREATE TABLE " + DATABASE_TABLE + "("
        + USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + USER_NAME + "TEXT NOT NULL," +USER_PASSWORD+");";



    public DataBaseHelperClass( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(CRETAE_DB_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS " + DATABASE_TABLE);
    }
}
//demo for the data base ; without doing  crud operation
