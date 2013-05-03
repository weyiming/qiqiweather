package com.example.weather.db;

/**
 * Created with IntelliJ IDEA.
 * Author: weiyiming
 * Date: 13-5-3
 * Time: 上午11:15
 */
public class DBContants {
    /*数据库版本号*/
    public static final int VERSION = 1;
    /*数据库名*/
    public static final String DBNAME = "qiqiweather.db";
    /*数据库表名*/
    public static final String[] TABLE_NAMES =
            {
                    DBContants.SK2WEATHER_TABLE,
                    DBContants.DETAILWEATHER_TABLE,
                    DBContants.INDEX_TABLE
            };
    /*数据库表字段名*/
    public static final String[][] FIELD_NAMES =
            {
                    DBContants.SK2WEATHER_FIELD_NAME,
                    DBContants.DETAILWEATHER_FIELD_NAME,
                    DBContants.INDEX_FIELD_NAME
            };
    /*数据库表字段类型*/
    public static final String[][] FIELD_TYPES =
            {
                    DBContants.SK2WEATHER_FIELD_TYPE,
                    DBContants.DETAILWEATHER_FIELD_TYPE,
                    DBContants.INDEX_FIELD_TYPE
            };

    /*整点实况天气表，包括时间点，温度，风向，风力，降水，湿度*/
    private static final String SK2WEATHER_TABLE = "sk2";
    private static final String[] SK2WEATHER_FIELD_NAME =
            {
                    "id",
                    "city_name",
                    "is_home",      //是否首选城市
                    "h",            //整点时间
                    "wd",           //温度
                    "fx",           //风向
                    "fl",           //风力
                    "js",           //降水
                    "sd"            //湿度
            };
    private static final String[] SK2WEATHER_FIELD_TYPE =
            {
                    "INTEGER PRIMARY KEY AUTOINCREMENT",
                    "text",
                    "int",
                    "int",
                    "int",
                    "int",
                    "int",
                    "int",
                    "int"
            };

    /*某个城市当天至未来5天的详细天气状况表*/
    private static final String DETAILWEATHER_TABLE = "detail";
    private static final String[] DETAILWEATHER_FIELD_NAME =
            {
                    "id",
                    "city_name",
                    "date",             //更新的日期
                    "week",             //星期
                    "temp1",            //从当天起至未来5天的气温，最高温到最低温
                    "temp2",
                    "temp3",
                    "temp4",
                    "temp5",
                    "temp6",
                    "weather1",         //从当天起至未来5天的天气
                    "weather2",
                    "weather3",
                    "weather4",
                    "weather5",
                    "weather6",
                    "wind1",            //从当天起至未来5天的风力
                    "wind2",
                    "wind3",
                    "wind4",
                    "wind5",
                    "wind6",
                    "fl1",              //从当天起至未来5天的风力等级
                    "fl2",
                    "fl3",
                    "fl4",
                    "fl5",
                    "fl6"
            };
    private static final String[] DETAILWEATHER_FIELD_TYPE =
            {
                    "INTEGER PRIMARY KEY AUTOINCREMENT",
                    "text",
                    "date",
                    "int",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text"
            };
    /*生活指数表*/
    private static final String INDEX_TABLE = "index";
    private static final String[] INDEX_FIELD_NAME =
            {
                    "id",
                    "city_name",
                    "index",            //穿衣指数
                    "index_d",          //穿衣指数描述
                    "index48",          //48小时穿衣指数
                    "index48_d",        //48小时穿衣指数描述
                    "index_uv",         //紫外线指数
                    "index48_uv",       //48小时紫外线指数
                    "index_xc",         //洗车指数
                    "index_tr",         //旅游指数
                    "index_co",         //舒适度指数
                    "index_cl",         //晨练指数
                    "index_ls",         //晾晒指数
                    "index_ag"          //息斯敏过敏指数
            };
    private static final String[] INDEX_FIELD_TYPE =
            {
                    "INTEGER PRIMARY KEY AUTOINCREMENT",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text",
                    "text"
            };
}
