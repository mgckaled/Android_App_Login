package com.example.android_app_login.activities.Main.uiwidgets;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android_app_login.R;

import java.util.Objects;

public class Activity_uIWToggleButton extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_u_i_w_toggle_button);

    /* Set toolbar title */
    this.setTitle("ToggleButton");

    // Set arrow back on top toolbar
    Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

    TextView textView = findViewById(R.id.tvTextLight);
    ToggleButton toggleButton = findViewById(R.id.tbTextDark);

      toggleButton.setOnCheckedChangeListener((compoundButton, b) -> {
        if (b)
        {
          textView.setVisibility(View.VISIBLE);
        }
        else
        {
          textView.setVisibility(View.INVISIBLE);
        }
      });
  }
}