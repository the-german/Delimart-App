package com.example.thegerman.delimart;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create an Handler for the splash screen
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // intent to switch to the other activity
                Intent i =  new Intent(MainActivity.this,ProductListActivity.class);
                startActivity(i);
                finish();
            }
        },3000);

    }
}
