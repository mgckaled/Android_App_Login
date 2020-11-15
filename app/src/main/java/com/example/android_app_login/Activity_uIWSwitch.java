package com.example.android_app_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;

import java.util.Objects;

public class Activity_uIWSwitch extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_u_i_w_switch);

    /* Set toolbar title */
    this.setTitle("SWitch");

    // Set arrow back on top toolbar
    Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

    ImageView imageView = findViewById(R.id.imgVWifi);
    Switch mySwitch = findViewById(R.id.swi_airplanemode);

    mySwitch.setOnCheckedChangeListener((buttonview, isChecked) -> {
      if (mySwitch.isChecked())
        imageView.setImageResource(R.drawable.ic_airplanemode_active_black_24dp);
      else
        imageView.setImageResource(R.drawable.ic_signal_wifi_1_bar_black_24dp);
    });
  }
}