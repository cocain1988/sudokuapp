package com.sudokuapp.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class GameBaseHelper extends SQLiteOpenHelper {

    private static final int    VERSION         = 1         ;
    private static final String DATABASE_NAME   = "sudoku.db";

    public GameBaseHelper(Context context){
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(
                "CREATE TABLE "+GameDbSchema.Users.NAME     +"(" +
                GameDbSchema.Users.Cols.ID+" integer primary key autoincrement, "+
                GameDbSchema.Users.Cols.DATE                +", "+
                GameDbSchema.Users.Cols.EMAIL               +", "+
                GameDbSchema.Users.Cols.NAME                +");"+
                "CREATE TABLE "+GameDbSchema.Games.NAME     +"( "+
                GameDbSchema.Games.Cols.ID+" integer primary key autoincrement, "+
                GameDbSchema.Games.Cols.USER_ID             + ", "+
                GameDbSchema.Games.Cols.TABLE_I             + ", "+
                GameDbSchema.Games.Cols.TABLE_J             + ", "+
                GameDbSchema.Games.Cols.KNOW_TAB_I          + ", "+
                GameDbSchema.Games.Cols.KNOW_TAB_J          + ", "+
                GameDbSchema.Games.Cols.TIME                + ");"+
                "CREATE TABLE "+GameDbSchema.Result.NAME    + "( "+
                GameDbSchema.Result.Cols.GAME_ID            + ", "+
                GameDbSchema.Result.Cols.TIME_RESULT        + ", "+
                GameDbSchema.Result.Cols.USER_ID            + ");"
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
