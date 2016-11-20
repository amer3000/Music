package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playPodcast(View v) {
        Intent player = new Intent(MainActivity.this, Player.class);
        startActivity(player);
    }

    public void discover(View v) {
        Intent i = new Intent(MainActivity.this, Discover.class);
        startActivity(i);
    }

    public void settings(View v) {
        Intent i = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(i);
    }

    public void subscriptions(View v) {
        Intent i = new Intent(MainActivity.this, Subscriptions.class);
        startActivity(i);
    }
}
