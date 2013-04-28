package com.example.weather.data;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-26
 * Time: 上午10:08
 * To change this template use File | Settings | File Templates.
 */
public class WeatherProviderService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    /*实时天气情况*/
    private static String skWeather = "http://www.weather.com.cn/data/sk/101010100.html";
    /*整点温度*/
    private static String sk2Weather = "http://flash.weather.com.cn/sk2/101010100.xml";
    /*详细天气情况*/
    private static String detailedWeather = "http://m.weather.com.cn/data/101010100.html";

    public static void main(String[] args){
        WeatherProviderService weatherProviderService = new WeatherProviderService();
        weatherProviderService.getDataFromWeatherCN();
    }

    public JSONObject getDataFromWeatherCN(){
        try {
            URL url = new URL(skWeather);
            try {
                URLConnection urlConnection = (HttpURLConnection)url.openConnection();
                InputStream in = new BufferedInputStream(url.openStream());
                StringBuffer sb = new StringBuffer();
                byte[] buf = new byte[1024];
                while(in.read(buf)!=-1)
                {
                    sb.append(new String(buf));
                }
                in.close();
                System.out.println(sb.toString());
                try {
                    JSONObject jsonObject = new JSONObject(sb.toString());
                } catch (JSONException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
