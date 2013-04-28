package com.example.weather.data;

import android.content.res.Resources;
import com.example.weather.R;

import java.io.IOException;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * Author: weiyiming
 * Date: 13-4-24
 * Time: 下午8:40
 */
public class CityCodeTransformer {
    private CityCodeTransformer cityCodeTransformer = new CityCodeTransformer();
    private String cityName;
    private Resources resources;

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    private CityCodeTransformer(){}

    public CityCodeTransformer getInstance(){
        return cityCodeTransformer;
    }

    public String fromNameToCode() throws IOException {
        Properties cityAndCode = new Properties();
        cityAndCode.load(resources.openRawResource(R.raw.city_and_code));
        return cityAndCode.getProperty(cityName);
    }
}
