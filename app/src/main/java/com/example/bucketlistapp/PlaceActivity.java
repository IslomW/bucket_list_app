package com.example.bucketlistapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class PlaceActivity extends AppCompatActivity {
    private RecyclerView list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        list = findViewById(R.id.recyclerview_place_to_go);

        placeView();

    }

    private void placeView() {
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
