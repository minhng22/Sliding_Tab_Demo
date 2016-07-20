package com.example.administrator.myapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
//import com.example.administrator.myapp.PageFragment;


public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] { "Android Lifetime", "Custom Layout", "Array ListView" };
    private Context context;

    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment newFragment = null;
        switch (position){
            case 0: newFragment = new AndroidLifetime();
                break;
            case 1: newFragment = new CustomLayout();
                break;
            case 2: newFragment = new PageFragment();
                break;
            default:
                break;
        }

        return newFragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}