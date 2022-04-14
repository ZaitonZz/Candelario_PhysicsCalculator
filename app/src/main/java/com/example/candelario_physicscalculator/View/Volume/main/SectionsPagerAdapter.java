package com.example.candelario_physicscalculator.View.Volume.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.candelario_physicscalculator.R;
import com.example.candelario_physicscalculator.View.Volume.FragmentFive;
import com.example.candelario_physicscalculator.View.Volume.FragmentFour;
import com.example.candelario_physicscalculator.View.Volume.FragmentOne;
import com.example.candelario_physicscalculator.View.Volume.FragmentThree;
import com.example.candelario_physicscalculator.View.Volume.FragmentTwo;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.volume_text_1, R.string.volume_text_2,R.string.volume_text_3,R.string.volume_text_4,R.string.volume_text_5};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fr= null;
        switch(position){
            case 0:
                fr = new FragmentOne();
                break;
            case 1:
                fr = new FragmentTwo();
                break;
            case 2:
                fr = new FragmentThree();
                break;
            case 3:
                fr = new FragmentFour();
                break;
            case 4:
                fr = new FragmentFive();
                break;
        }
        return fr;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Shows total pages.
        return 5;
    }
}