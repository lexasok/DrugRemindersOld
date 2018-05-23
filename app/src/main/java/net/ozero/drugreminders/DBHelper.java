package net.ozero.drugreminders;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    //DATABASE
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "drugRemindersDb";

    //TABLES
    public static final String TABLE_PERSONS = "tablePersons";

    //COLUMN KEYS
    public static final String KEY_NAME = "name";
    public static final String KEY_ID = "_id";



    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_PERSONS + "(" + KEY_ID
        + " integer primary key," + KEY_NAME + " text" + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_PERSONS);
        onCreate(db);
    }
}
