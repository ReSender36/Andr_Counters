package com.example.mdi.andr_counters.Helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by mdi on 15.12.2016.
 */

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context){
        super(context,"myDB",null,1) ;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table mytable(id integer primary key autoincrement,name text, email text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

