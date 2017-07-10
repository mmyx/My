package com.example.administrator.my_76;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        ArrayList<Fragment> list=new ArrayList<>();
        list.add(new BlankFragment());
        list.add(new Blank2Fragment());
        list.add(new Blank4Fragment());
        ViewPag viewPag=new ViewPag(getSupportFragmentManager(),list);
        viewpager.setAdapter(viewPag);

    }
}
