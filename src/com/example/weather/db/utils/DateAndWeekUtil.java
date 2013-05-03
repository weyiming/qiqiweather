package com.example.weather.db.utils;

/**
 * Created with IntelliJ IDEA.
 * Author: weiyiming
 * Date: 13-5-3
 * Time: 上午11:54
 */
public class DateAndWeekUtil {
    private String[] weeks =
            {
                    "星期天",
                    "星期一",
                    "星期二",
                    "星期三",
                    "星期四",
                    "星期五",
                    "星期六"
            };

    /*获取星期所对应的索引，用于存入数据库*/
    public int getWeekIndex(String week)
    {
        int i = 0;
        for (; i < 7; i++)
        {
            if (weeks[i].equals(week))
                return i;
        }
        return i;
    }


}
