package com.example.android_app_login.activities.Main.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android_app_login.R;

import java.util.Objects;

public class Activity_uIWTextView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i_w_text_view);

        // Set toolbar title
        this.setTitle("TextView");

        // Set arrow back on top toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }
}