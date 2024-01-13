package com.example.bucketlistapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ThingActivity extends AppCompatActivity {
    private RecyclerView list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thing);
        list = findViewById(R.id.recyclerview_thing_to_do);

        thingsView();

    }


    private void thingsView() {

        Bucket[] buckets = {
                new Bucket("Road trip", "Sdelat road trip", R.drawable.road_trip),
                new Bucket("Diving", "Sdelat road trip", R.drawable.scubadive),
                new Bucket("Sky Diving", "Sdelat road trip", R.drawable.skydive),
                new Bucket("See nothern Lights", "Sdelat road trip", R.drawable.northern_lights)
        };

        BucketAdapter adapter = new BucketAdapter(buckets);
        list.setAdapter(adapter);
    }
}
