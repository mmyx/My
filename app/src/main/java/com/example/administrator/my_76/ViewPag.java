package com.example.administrator.my_76;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/7/6 0006.
 */

public class ViewPag extends FragmentPagerAdapter {

    private final ArrayList<Fragment> list;

    public ViewPag(FragmentManager fm, ArrayList<Fragment> list) {
        super(fm);
        this.list=list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
