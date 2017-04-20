package com.example.sam.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Car extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        MainMenuFragment mainMenu = new MainMenuFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.activity_car, mainMenu).commit();
    }
}
