package com.vika.loftmoney;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ViewPager viewPager;
    private PagerAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        adapter = new MainPagesAdapter(getSupportFragmentManager(), this);
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }

    @Override
    protected void onStart() {
        Log.i(TAG, "onStart: ");
        super.onStart();

    }

    @Override
    protected void onResume() {
        Log.i(TAG, "onResume: ");
        super.onResume();

    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onPause: ");
        super.onPause();

    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy: ");
        super.onDestroy();

    }
}
