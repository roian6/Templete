package com.example.david0926.templete;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter{

    int num;

    public TabAdapter(FragmentManager fm, int num) {
        super(fm);
        this.num = num;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                Frag1 tab1 = new Frag1();
                return tab1;
            case 1:
                Frag2 tab2 = new Frag2();
                return tab2;
            case 2:
                Frag3 tab3 = new Frag3();
                return tab3;

            default: return null;

        }
    }

    @Override
    public int getCount() {
        return num;
    }
}
