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
    /*数据库版本号*/
    private static final int VERSION = 1;
    /*数据库名*/
    private static final String DBNAME = "qiqiweather.db";
    /*整点实况天气表，包括时间点，温度，风向，风力，降水，湿度*/
    private static final String SK2WEATHER_TABLE = "sk2";
    /*城市名，整点时间，温度，风向，风力，降水，湿度*/
    private static final String[] SK2WEATHER_FIELD_NAMES =
            {"id", "city_name", "h", "wd", "fx", "fl", "js", "sd"};
    private static final String[] SK2WEATHER_FIELD_TYPES =
            {"INTEGER PRIMARY KEY AUTOINCREMENT", "text", "int", "int", "int", "int", "int", "int"};
    /*某个城市当天至未来5天的详细天气状况表*/
    private static final String DETAILWEATHER_TABLE = "detail";
    /*生活指数表*/
    private static final String INDEX_TABLE = "index";
    private static final String[] INDEX_FIELD_NAME = {"index", "index_d"};

    public DBController(Context context)
    {
        dbHelper = new MySQLiteOpenHelper(context, DBNAME, null, VERSION,);
    }

}
