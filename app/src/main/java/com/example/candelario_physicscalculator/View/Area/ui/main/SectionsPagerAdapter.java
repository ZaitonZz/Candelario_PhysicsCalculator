package com.example.candelario_physicscalculator.View.Area.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.candelario_physicscalculator.R;
import com.example.candelario_physicscalculator.View.Area.A_FragmentFive;
import com.example.candelario_physicscalculator.View.Area.A_FragmentFour;
import com.example.candelario_physicscalculator.View.Area.A_FragmentOne;
import com.example.candelario_physicscalculator.View.Area.A_FragmentThree;
import com.example.candelario_physicscalculator.View.Area.A_FragmentTwo;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.area_text_1,R.string.area_text_2,R.string.area_text_3,R.string.area_text_4,R.string.area_text_5};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch(position){
            case 0:
                fragment= new A_FragmentOne();
                break;
            case 1:
                fragment= new A_FragmentTwo();
                break;
            case 2:
                fragment= new A_FragmentThree();
                break;
            case 3:
                fragment= new A_FragmentFour();
                break;
            case 4:
                fragment= new A_FragmentFive();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 5;
    }
}