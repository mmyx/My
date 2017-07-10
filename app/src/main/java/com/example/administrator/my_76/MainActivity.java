package com.example.administrator.my_76;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
//myaaaaaaaa
public class MainActivity extends AppCompatActivity {

    private ListView list;
    private SQLiteDatabase readable;
   ArrayList<HashMap<String,String>> list_map=new ArrayList<>();
    private SQLiteDatabase readable_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sql sql = new Sql(this, "a.db", null, 1);
        readable = sql.getReadableDatabase();
        for (int i = 0; i < 10; i++) {
            ContentValues values = new ContentValues();
            values.put("name", "第" + i + "个");
            values.put("content", "hhhhhhhh");
            readable.insert("us", null, values);
        }



        SqlUrl url = new SqlUrl(this, "url.db", null, 1);
        readable_url = sql.getReadableDatabase();
        for (int i = 0; i < 10; i++) {
            ContentValues values = new ContentValues();
            values.put("url", R.mipmap.ic_launcher);
            values.put("ur", R.mipmap.ic_launcher_round);
            values.put("u", R.drawable.home_server_service);
            readable_url.insert("us", null, values);
        }
        initView();
    }

    private void initView() {
        list = (ListView) findViewById(R.id.list);
        Cursor us = readable.query("us", null, null, null, null, null, null);
          while (us.moveToNext()){
              HashMap<String,String> map=new HashMap<>();
              String n_id = us.getString(0);
              String name = us.getString(1);
              String content = us.getString(2);
              map.put("n_id",n_id);
              map.put("name",name);
              map.put("content",content);
              list_map.add(map);
          }
        Cursor url = readable_url.query("url", null, null, null, null, null, null);
        while (url.moveToNext()){
            HashMap<String,String> map=new HashMap<>();
            String name = us.getString(1);
            map.put("url",name);
        }
        SimpleAdapter adapter=new SimpleAdapter(MainActivity.this,list_map,R.layout.item,new String[]{"name","content"},new int[]{R.id.text1,R.id.text2});
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("nan",list_map.get(i).get("content"));
                startActivity(intent);
            }
        });

   }
}
