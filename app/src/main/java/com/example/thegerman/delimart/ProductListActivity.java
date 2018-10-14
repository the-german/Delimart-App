package com.example.thegerman.delimart;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.thegerman.delimart.Adapter.ProductAdapter;
import com.example.thegerman.delimart.Model.Product;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ProductListActivity extends AppCompatActivity {

    ArrayList<Product> arrayList;
    ProductAdapter productAdapter;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
         listView = findViewById(R.id.lvProducts);

        // Construct the data source
         arrayList = new ArrayList<>();

        // Create the adapter to convert the array to views
         productAdapter = new ProductAdapter(this,arrayList);

        // Attach the adapter to a ListView
        listView.setAdapter(productAdapter);

        // Add item to the adapter
        Product Bannane = new Product("Bananne","La bannane est le fruit ou la baie derivant de l'inflorecence du bananier." +
                "Les bannanes sont des fruit tres generalement steriles issue d'une variete domestiquees." +
                "Seul les fruits des bananiers sauvages et quelque cultivars domestiques" +
                " contiennent des graines","25.04","20 disponible",R.drawable.banane);
        productAdapter.add(Bannane);

        Product Pomme = new Product("Pomme","La pomme est un fruit comestible à pépins d'un goût sucré et acidulé et à la propriété plus ou moins astringente selon les variétés. " +
                "D'un point de vue botanique, il s'agit d'un fruit complexe." +
                " Elle est produite par les pommiers, des arbres du genre Malus.","55.04","50 diponibles",R.drawable.pomme);
        productAdapter.add(Pomme);

        Product Pain = new Product("Pain","e pain est l'aliment de base traditionnel de nombreuses cultures. " +
                "Il est fabriqué à partir des ingrédients qui sont la farine et l'eau. " +
                "Il contient généralement du sel. D'autres ingrédients s'ajoutent selon le type de " +
                "pain et la manière dont il est préparé culturellement." +
                " Lorsqu'on ajoute le levain ou la levure, la pâte du pain est" +
                " soumise à un gonflement dû à la fermentation.","50.04","10 diponibles",R.drawable.pain);
        productAdapter.add(Pain);

        Product Concombre = new Product("Concombre","Le concombre est une plante potagère herbacée, rampante, de la même famille que la calebasse africaine, " +
                "le melon ou la courge. C'est botaniquement " +
                "un fruit qui est consommé comme un légume.","20.04","10 diponibles",R.drawable.concombre);
        productAdapter.add(Concombre);

        Product Patate = new Product("Patate","La pomme de terre, ou patate, est un tubercule comestible produit par l’espèce Solanum tuberosum, appartenant à la famille des solanacées. Le terme désigne" +
                " également la plante elle-même, plante herbacée, vivace par ses tubercules mais " +
                "toujours cultivée comme une culture annuelle","20.04","10 diponibles",R.drawable.patate);
        productAdapter.add(Patate);

        Product Raisin = new Product("Raisin","Le raisin est le fruit de la vigne. " +
                "Le raisin de la vigne cultivée Vitis vinifera est un des fruits les plus cultivés " +
                "au monde, avec 68 millions de tonnes produites en 2010, derrière " +
                "les agrumes, les bananes et les pommes","10.04","10 diponibles",R.drawable.raisin);
        productAdapter.add(Raisin);

        Product Tomate = new Product("Tomate","Le plant de tomates est une espèce de plantes herbacées du genre solanum de la famille des Solanacées, originaire du nord-ouest de l'Amérique du Sud, largement cultivée pour son fruit. " +
                "Le terme désigne aussi ce fruit charnu. " +
                "La tomate se consomme comme un légume-fruit, crue ou cuite","25.04","30 diponibles", R.drawable.tomate);
        productAdapter.add(Tomate);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ProductListActivity.this,SingleProductActivity.class);
                startActivity(intent);
            }
        });
    }


}

