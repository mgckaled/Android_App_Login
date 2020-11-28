package com.example.android_app_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class InitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);

        getSupportActionBar().hide();

    }
}