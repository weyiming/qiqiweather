package com.example.weather.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Author: weiyiming
 * Date: 13-4-26
 * Time: 下午10:18
 */
public class MySQLiteOpenHelper extends SQLiteOpenHelper
{
    public String[] tableNames;
    public String[][] fieldNames;
    public String[][] fieldTypes;
    public static String NO_CREATE_TABLES = "no tables";
    private String message = "";

    public MySQLiteOpenHelper(Context context, String dbname,
                              CursorFactory factory, int version,
                              String tableNames[], String fieldNames[][],
                              String fieldTypes[][])
    {
        super(context, dbname, factory, version);
        this.tableNames = tableNames;
        this.fieldNames = fieldNames;
        this.fieldTypes = fieldTypes;

    }

    public String getMessage()
    {
        return message;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        if (tableNames == null)
        {
            message = NO_CREATE_TABLES;
            return;
        }

        /* 创建table */
        for (int i = 0; i < tableNames.length; i++)
        {
            String sql = "CREATE　TABLE " + tableNames[i] + " (";
            for (int j = 0; j < fieldNames[i].length; j++)
            {
                sql += fieldNames[i][j] + " " + fieldTypes[i][j] + " ";
            }
            sql = sql.substring(0, sql.length() - 1);
            sql += ")";
            sqLiteDatabase.execSQL(sql);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int arg1, int arg2)
    {
        for (int i = 0; i <tableNames[i].length(); i++)
        {
            String sql = "DROP TABLE IF EXISTS " + tableNames[i];
            sqLiteDatabase.execSQL(sql);
        }
        onCreate(sqLiteDatabase);
    }

    @Override
    public  synchronized void close()
    {
        super.close();
    }

    public void execSQL(String sql) throws SQLException
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.execSQL(sql);
    }

    /**
    *查询数据
    *
    *@Param table
    *       查询的 table name
    *@Param columns
    *       查询的数据的字段名称
    *@Param selection
    *       查询的条件字符串 如： field1 = ? and field2 = ?
    *@Param selectionArgs
    *       查询条件的值 如： ["a","b"]
    *@Param groupBy
    *       groupBy后的字符串 如： field1,field2
    *@Param having
    *       having后的字符串
    *@Param orderBy
    *       orderBy后的字符串
    *@return Cursor包含了取得的数据集
    */
    public Cursor select(String table, String[] columns, String selection,
                         String[] selectionArgs, String groupBy, String having,
                         String orderBy)
    {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.query(table, columns, selection,
                                             selectionArgs, groupBy, having,
                                             orderBy);
        return cursor;
    }

    /**
     *添加数据
     *
     *@Param table
     *       添加数据的 table name
     *@Param fields
     *       查询的数据的字段名称
     *@Param values
     *       添加数据的字段值
     *@return long row id
     */
    public long insert(String table, String[] fields, String[] values)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        /* 将添加的值放入ContentValues */
        ContentValues contentValues = new ContentValues();
        for (int i = 0; i < fields.length; i++)
        {
            contentValues.put(fields[i],values[i]);
        }
        return sqLiteDatabase.insert(table, null, contentValues);
    }

    /**
     *删除数据
     *
     *@Param table
     *       删除数据的 table name
     *@Param where
     *       删除数据的条件
     *@Param whereValue
     *       删除数据的条件值
     *@return int 删除的笔数
     */
    public int delete(String table, String where, String[] whereValue)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        return sqLiteDatabase.delete(table, where, whereValue);
    }

    /**
     *更新数据
     *
     *@Param table
     *       更新数据的 table name
     *@Param fields
     *       更新数据的字段名称
     *@Param values
     *       更新数据的字段值
     *@Param where
     *       更新数据的条件
     *@Param whereValue
     *       更新数据的条件值
     *@return int 更新的笔数
     */
    public int update(String table, String[] updateFields, String[] updateValues,
                      String where, String[] whereValue)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        /* 将修改的值放入ContentValues */
        ContentValues contentValues = new ContentValues();
        for (int i = 0; i < updateFields.length; i++)
        {
            contentValues.put(updateFields[i],updateValues[i]);
        }
        return sqLiteDatabase.update(table, contentValues, where, whereValue);
    }
}
