package com.example.weather.actitvities;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import com.example.weather.R;
import com.example.weather.db.MySQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: weiyiming
 * Date: 13-4-26
 * Time: 下午1:08
 */
public class CityManager extends Activity {
    private MySQLiteOpenHelper dbHelper;
    private SQLiteDatabase db;
    private Cursor cursor;
    private ListView cityListView;
    private SimpleCursorAdapter adapter;
    private static final String[] FROM = {};
    private List<String> testData = new ArrayList<String>();

    private void initData()
    {
        testData.add("北京");
        testData.add("杭州");
        testData.add("东阳");
        testData.add("石家庄");
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        //SimpleAdapter simpleAdapter = new ();
        TextImageAdapter textImageAdapter = new TextImageAdapter(this);
        //setListAdapter(textImageAdapter);
    }

    public final class ViewHolder{
        public TextView cityName;
        public ImageView home;
        public ImageView separator;
        public ImageView delete;
    }


    private class TextImageAdapter extends BaseAdapter
    {
        private LayoutInflater layoutInflater;


        public TextImageAdapter(Context context)
        {
            this.layoutInflater = LayoutInflater.from(context);
        }


        @Override
        public int getCount() {
            return testData.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View contentView, ViewGroup parent) {
            ViewHolder viewHolder = null;
            if (contentView == null)
            {
                layoutInflater.inflate(R.layout.citymanager, null);
                viewHolder = new ViewHolder();
                viewHolder.cityName = (TextView)findViewById(R.id.cityName);
                viewHolder.home = (ImageView)findViewById(R.id.home);
                viewHolder.separator = (ImageView)findViewById(R.id.separator);
                viewHolder.delete = (ImageView)findViewById(R.id.delete);
                contentView.setTag(viewHolder);
            }
            viewHolder.cityName.setText(testData.get(position));
            viewHolder.home.setBackgroundResource(R.drawable.ic_citymanager_home_unactivated);
            viewHolder.separator.setBackgroundResource(R.drawable.ic_citymanager_separator);
            viewHolder.delete.setBackgroundResource(R.drawable.ic_citymanager_delete);
            return contentView;
        }
    }
}