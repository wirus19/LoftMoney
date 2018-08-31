package com.vika.loftmoney;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainPagesAdapter extends FragmentPagerAdapter {
    private final static int PAGE_INCOMES = 0;
    private final static int PAGE_COSTS = 1;
    private final static int PAGE_BALANCE = 2;
    private final static int PAGES_COUNT = 3;

    private String[] pageTitles;


    public MainPagesAdapter(FragmentManager fm, Context context) {
        super(fm);
        pageTitles = context.getResources().getStringArray(R.array.main_tabs);

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case PAGE_INCOMES:

                return ItemsFragment.newInstance(ItemsFragment.TYPE_INCOMES);

            case PAGE_COSTS:

                return ItemsFragment.newInstance(ItemsFragment.TYPE_COSTS);

            case PAGE_BALANCE:
                return ItemsFragment.newInstance(ItemsFragment.TYPE_BALANCE);


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGES_COUNT;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return pageTitles[position];
    }
}