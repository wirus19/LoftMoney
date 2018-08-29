package com.vika.loftmoney;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Milk", "70$"));
        items.add(new Item("Orange", "2.5$"));
        items.add(new Item("Pan", "70$"));
        items.add(new Item("Glass", "10$"));
        items.add(new Item("Apple", "3$"));


        RecyclerView recycler = findViewById(R.id.recycler);
        ItemsAdapter adapter = new ItemsAdapter();
        adapter.setItems(items);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }
}
