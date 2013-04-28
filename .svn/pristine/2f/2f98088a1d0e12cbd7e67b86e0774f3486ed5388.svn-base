package com.example.weather.actitvities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.example.weather.R;

/**
 * Created with IntelliJ IDEA.
 * Author: weiyiming
 * Date: 13-4-27
 * Time: 下午1:09
 */
public class Main extends Activity {
    private ImageView location;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        /*注册location图片点击事件，点击后跳转到城市管理avtivity*/
        location = (ImageView)findViewById(R.id.mainLocationImageView);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Main.this, CityManager.class);
                startActivity(intent);
            }
        });
    }


}