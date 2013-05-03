package com.example.weather.db;

import android.content.Context;

/**
 * Created with IntelliJ IDEA.
 * Author: weiyiming
 * Date: 13-4-27
 * Time: 下午6:58
 */
public class DBController {
    /*引入sqlite数据库helper*/
    private MySQLiteOpenHelper dbHelper;


    public DBController(Context context)
    {
        dbHelper = new MySQLiteOpenHelper
                (
                        context,
                        DBContants.DBNAME,
                        null,
                        DBContants.VERSION,
                        DBContants.TABLE_NAMES,
                        DBContants.FIELD_NAMES,
                        DBContants.FIELD_TYPES
                );
    }

    public

}
