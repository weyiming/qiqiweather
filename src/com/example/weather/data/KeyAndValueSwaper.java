package com.example.weather.data;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Author: weiyiming
 * Date: 13-4-24
 * Time: 下午9:23
 */
public class KeyAndValueSwaper {
    public static void main(String [] args) throws IOException {
        /*导入已有属性资源文件*/
        Properties codeAndCity = new Properties();
        codeAndCity.load(new FileReader(new File("d:/android/apps/weather/res/raw/code_and_city.txt")));

        /*提取键集*/
        Set<String> keySet = codeAndCity.stringPropertyNames();

        /*创建城市名对应城市代码的空白资源文件，用于存入结果*/
        File cityAndCode = new File("d:/android/apps/weather/res/raw/city_and_code.properties");
        if(!cityAndCode.exists())
            cityAndCode.createNewFile();

        /*写入空白的资源文件，键作为新的值，原来的值作为新的键*/
        OutputStreamWriter writer = new FileWriter(cityAndCode);
        for(String code:keySet)
            writer.append(codeAndCity.getProperty(code) + "=" + code + "\n");
        writer.flush();
    }
}
