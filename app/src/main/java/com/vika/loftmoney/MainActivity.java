package com.vika.loftmoney;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    //    private static final int REQUEST_CODE = 100;

    private ViewPager viewPager;
    private PagerAdapter adapter;
    private TabLayout tabLayout;
    private Toolbar toolbar;
//    private FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        toolbar = findViewById(R.id.toolbar);
        viewPager = findViewById(R.id.view_pager);


        //        fab = findViewById(R.id.fab);
        //        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, AddActivity.class);
//                intent.putExtra(AddActivity.KEY_TYPE, Item.TYPE_EXPENSE);
//                startActivityForResult(intent, REQUEST_CODE);
//            }
//        });
        setSupportActionBar(toolbar);
        adapter = new MainPagesAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
//            String name = data.getStringExtra(AddActivity.KEY_NAME);
//            String price = data.getStringExtra(AddActivity.KEY_PRICE);
//        }
//    }

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
