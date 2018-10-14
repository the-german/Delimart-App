package com.example.thegerman.delimart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.thegerman.delimart.Adapter.ProductAdapter;
import com.example.thegerman.delimart.Model.Product;
import android.widget.ListView;

import java.util.ArrayList;

public class ProductListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        // Construct the data source
        ArrayList<Product> arrayList = new ArrayList<Product>();

        // Create the adapter to convert the array to views
        ProductAdapter productAdapter = new ProductAdapter(this,arrayList);
        // Attach the adapter to a ListView
        ListView listView = findViewById(R.id.lvProducts);
        listView.setAdapter(productAdapter);
    }
}
