package com.example.thegerman.delimart.Model;

import android.net.Uri;

public class Product {
    public String name;
    public  String description;
    public  String quantity;
    public String price;
    public int image;

    public Product(String name, String description, String price, String quantity, int image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}
