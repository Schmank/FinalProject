package com.example.sam.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button houseBtn;
    private Button carBtn;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        houseBtn = (Button) findViewById(R.id.houseID);
        houseBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, House.class);
                startActivityForResult(intent, 1);
            }
        });

        carBtn = (Button) findViewById(R.id.carID);
        carBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, Car.class);
                startActivityForResult(intent, 2);
            }
        });
    }
}
