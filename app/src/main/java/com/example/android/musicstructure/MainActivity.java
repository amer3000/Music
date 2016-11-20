package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Based on example code from Udacity
        TextView subscriptions = (TextView) findViewById(R.id.activity_subscriptions);
        subscriptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Subscriptions.class);
                startActivity(i);
            }
        });

        TextView discover = (TextView) findViewById(R.id.activity_discover);
        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Discover.class);
                startActivity(i);
            }
        });

        TextView settings = (TextView) findViewById(R.id.activity_settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(i);
            }
        });

        // No need to set onClick listener on individual text views.
        LinearLayout player = (LinearLayout) findViewById(R.id.activity_player);
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Player.class);
                startActivity(i);
            }
        });

    }
}
