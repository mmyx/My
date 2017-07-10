package com.example.administrator.my_76;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private ViewPager page;
    private TextView nan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        Intent intent = getIntent();
        String nan_text = intent.getStringExtra("nan");
        nan.setText(nan_text);
        ArrayList<Fragment> list=new ArrayList<>();
        list.add(new BlankFragment());
        list.add(new Blank2Fragment());
        Pager pager=new Pager(getSupportFragmentManager(),list);
        page.setAdapter(pager);
    }

    private void initView() {
        page = (ViewPager) findViewById(R.id.page);
        nan = (TextView) findViewById(R.id.nan);
    }
}
