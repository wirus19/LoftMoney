package com.vika.loftmoney;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ItemsFragment extends Fragment {
    private static final int TYPE_UNKNOWN = -1;
    private static final String KEY_TYPE = "type";
    public static final int TYPE_INCOMES = 1;
    public static final int TYPE_COSTS = 2;
    public static final int TYPE_BALANCE = 3;


    public static ItemsFragment newInstance(int type) {
        ItemsFragment fragment = new ItemsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ItemsFragment.KEY_TYPE, type);
        fragment.setArguments(bundle);
        return fragment;
    }

    public ItemsFragment() {
        // Required empty public constructor
    }

    private RecyclerView recycler;
    private ItemsAdapter adapter;
    private int type;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle args = getArguments();
        if (args != null) {
            type = args.getInt(KEY_TYPE, TYPE_UNKNOWN);
            if (type == TYPE_UNKNOWN) {
                throw new IllegalStateException("Unknown type");
            }
        } else {
            throw new IllegalStateException("You must pass valid statement tye");
        }
        type = args.getInt(KEY_TYPE);
        adapter = new ItemsAdapter();


        adapter.setItems(createTestItems());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_items, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        recycler = view.findViewById(R.id.recycler);


        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(requireContext()));


    }

    private List<Item> createTestItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Milk", "70$"));
        items.add(new Item("Orange", "2.5$"));
        items.add(new Item("Pan", "70$"));
        items.add(new Item("Glass", "10$"));
        items.add(new Item("Apple", "3$"));
        return items;
    }
}
