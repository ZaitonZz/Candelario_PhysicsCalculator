package com.example.candelario_physicscalculator.View.Volume.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.candelario_physicscalculator.R;
import com.example.candelario_physicscalculator.View.Volume.V_FragmentFive;
import com.example.candelario_physicscalculator.View.Volume.V_FragmentFour;
import com.example.candelario_physicscalculator.View.Volume.V_FragmentOne;
import com.example.candelario_physicscalculator.View.Volume.V_FragmentThree;
import com.example.candelario_physicscalculator.View.Volume.V_FragmentTwo;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.volume_text_1,R.string.volume_text_2,R.string.volume_text_3,R.string.volume_text_4,R.string.volume_text_5};
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
                fragment= new V_FragmentOne();
                break;
            case 1:
                fragment= new V_FragmentTwo();
                break;
            case 2:
                fragment= new V_FragmentThree();
                break;
            case 3:
                fragment= new V_FragmentFour();
                break;
            case 4:
                fragment= new V_FragmentFive();
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