package com.teja.apple.oakridgeinternationalschool.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.teja.apple.oakridgeinternationalschool.Fragment.BooksFragment;
import com.teja.apple.oakridgeinternationalschool.Fragment.SportsFragment;
import com.teja.apple.oakridgeinternationalschool.Fragment.UniformsFragment;

/**
 * Created by raja on 12/04/2018.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                //Fragement for Android Tab
                return new SportsFragment();
            case 1:
                //Fragment for Ios Tab
                return new BooksFragment();
            case 2:
                //Fragment for Windows Tab
                return new UniformsFragment();
        }
        return null;

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 3; //No of Tabs
    }

}