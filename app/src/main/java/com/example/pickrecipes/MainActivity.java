package com.example.pickrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_list);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewList);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        List<CardList> dataList =  new ArrayList<>();
        dataList.add(new CardList("[Soup]", "Korean Kimchi"));
        dataList.add(new CardList("[Soup]", "Korean Kimchi"));
        dataList.add(new CardList("[Soup]", "Korean Kimchi"));
        dataList.add(new CardList("[Soup]", "Korean Kimchi"));
        dataList.add(new CardList("[Soup]", "Korean Kimchi"));
        dataList.add(new CardList("[Soup]", "Korean Kimchi"));
        dataList.add(new CardList("[Soup]", "Korean Kimchi"));

        RecyclerViewListAdapter adapter = new RecyclerViewListAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }
}
