package com.example.eslamelmishtawy.qemarkets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        /**
         * Adding items to Top Deals View
         */
        RecyclerView recyclerView =  (RecyclerView) findViewById(R.id.topDealsView);
        List<TopDeals> topDeals = new ArrayList<>();
        topDeals.add(new TopDeals(R.drawable.test2));
        topDeals.add(new TopDeals(R.drawable.test2));
        topDeals.add(new TopDeals(R.drawable.test2));

        TopDealsAdapter itemsAdapter1 =
                new TopDealsAdapter(topDeals,getApplication());
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(HomeScreen.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);
        recyclerView.setAdapter(itemsAdapter1);

        /**
         * Adding items to Top sales view
         */

        RecyclerView recyclerView2 =  (RecyclerView) findViewById(R.id.topSalesView);
        List<TopSales> topSales = new ArrayList<>();
        topSales.add(new TopSales(R.drawable.logo1,"blabla", "50 EGP", "10 EGP"));
        topSales.add(new TopSales(R.drawable.test2,"blabla", "50 EGP", "10 EGP"));
        topSales.add(new TopSales(R.drawable.test2,"blabla", "50 EGP", "10 EGP"));

        TopSalesAdapter itemsAdapter3 =
                new TopSalesAdapter(topSales,getApplication(),R.drawable.ic_add_shopping_cart_black_24dp,R.drawable.ic_favorite_border_black_24dp);
        LinearLayoutManager horizontalLayoutManager2 = new LinearLayoutManager(HomeScreen.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(horizontalLayoutManager2);
        recyclerView2.setAdapter(itemsAdapter3);

        /**
         * Adding Items to categories grid view
         */
        ArrayList<Categories> categories = new ArrayList<>();

        categories.add(new Categories(R.drawable.logo1));
        categories.add(new Categories(R.drawable.test1));
        categories.add(new Categories(R.drawable.test1));
        categories.add(new Categories(R.drawable.test1));

        CategoriesAdapter itemsAdapter2 =
                new CategoriesAdapter(this, categories);

        com.example.eslamelmishtawy.qemarkets.ExpandableHeightGridView gridView = (com.example.eslamelmishtawy.qemarkets.ExpandableHeightGridView) findViewById(R.id.categoriesView);
        gridView.setAdapter(itemsAdapter2);
        gridView.setExpanded(true);
    }
}
