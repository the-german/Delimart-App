package com.example.thegerman.delimart.Model;

import android.graphics.Bitmap;

public class Product {
    public String name;
    public  String description;
    public  String quantity;
    public String price;
    public Bitmap image;

    public Product(String name, String description, String price, String quantity, Bitmap image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.quantity = quantity;
    }
}
