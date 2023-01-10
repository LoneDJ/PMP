package com.example.myapplication;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragAdapter extends FragmentPagerAdapter {
    public FragAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Frag();
        } else if (position == 1) {
            return new Frag2();
        } else {
            return new Frag3();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
