package edu.csulb.android.photonotes;

import java.util.ArrayList;
import java.util.List;
import android.content.ContentValues; import android.content.Context; import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseHandler extends SQLiteOpenHelper {
    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "photoNotes";
    // Labels table name
    private static final String TABLE_LABELS = "labels";
    // Labels Table Columns names
    private static final String KEY_ID = "label";
    private static final String KEY_NAME = "path";
    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
    // Category table create query
        String CREATE_CATEGORIES_TABLE = "CREATE TABLE " +
                TABLE_LABELS + "("
                + KEY_ID + " TEXT," +
                KEY_NAME + " TEXT)";
        db.execSQL(CREATE_CATEGORIES_TABLE);
    }
    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
// Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_LABELS);
// Create tables again
        onCreate(db);
    }
    /**
     * Inserting new label into labels table
     * */
    public void insertLabel(String label, String path){ SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues(); values.put(KEY_ID, label); values.put(KEY_NAME,path);
        // Inserting Row
        db.insert(TABLE_LABELS, null, values);
        db.close(); // Closing database connection
    }
    public String getPath(String label){
        String path = null;
        String selectQuery = "SELECT " + KEY_NAME + " FROM " + TABLE_LABELS + " WHERE " + KEY_ID + " = " + "'" + label + "'";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
     cursor.moveToFirst();
        path = cursor.getString(0);
        // closing connection
        cursor.close(); db.close();
        return path;
    }
    /**
     * Getting all labels
     * returns list of labels
     * */
    public List<String> getAllLabels(){
        List<String> labels = new ArrayList<String>();
        // Select All Query
        String selectQuery = "SELECT " + KEY_ID + " FROM " +
                TABLE_LABELS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
// looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }
// closing connection
        cursor.close(); db.close();
// returning labels
        return labels;
    }
}

