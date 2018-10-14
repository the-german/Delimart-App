package com.example.thegerman.delimart.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thegerman.delimart.Model.Product;
import com.example.thegerman.delimart.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {
    public ProductAdapter( Context context, ArrayList<Product> products) {
        super(context,0,  products);
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        // Get the data item for this position
        Product product = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.product_item,parent,false);
        }
        // Lookup view for data population
        ImageView ivImage = convertView.findViewById(R.id.ivImage);
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvQuantity = convertView.findViewById(R.id.tvQuantity);
        TextView tvPrice = convertView.findViewById(R.id.tvPrice);

        // Populate the data into the template view using the data object
        ivImage.setImageResource(0);
        tvName.setText(product.getName());
        tvQuantity.setText(product.getQuantity());
        tvPrice.setText(product.getPrice());

        Picasso.with(getContext()).load(product.getImage()).into(ivImage);

        // Return the completed view to render on screen
        return  convertView;
    }
}
