package com.example.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
private CardView thing;
private CardView place;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thing = findViewById(R.id.cardview_things_to_do);
        place = findViewById(R.id.cardview_place_to_go);

        thingCardClicked();
        placeCardClicked();

    }

    private void placeCardClicked() {
        Intent placeIntent = new Intent(MainActivity.this, PlaceActivity.class);

        place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(placeIntent);
            }
        });
    }

    private void thingCardClicked() {
        Intent thingIntent = new Intent(MainActivity.this, ThingActivity.class);

        thing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(thingIntent);
            }
        });
    }
}