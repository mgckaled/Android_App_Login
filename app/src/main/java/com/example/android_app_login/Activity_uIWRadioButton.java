package com.example.android_app_login;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Objects;

public class Activity_uIWRadioButton extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_u_i_w_radio_button);

    // Set toolbar title
    this.setTitle("RadioButton");

    // Set arrow back on top toolbar
    Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

    Button btnRbResult = findViewById(R.id.rbBtnSubmit);
    final TextView rbTextResult = findViewById(R.id.rbTextResult);
    final RadioButton radio_blue = findViewById(R.id.rdBlue);
    RadioButton radio_green = findViewById(R.id.rdGreen);
    RadioButton radio_red = findViewById(R.id.rdred);

    btnRbResult.setOnClickListener(view -> {
      if (radio_blue.isChecked())
      {
        rbTextResult.setText("Prefiro a cor Azul");
        rbTextResult.setTextColor(Color.BLUE);
      }
      if (radio_green.isChecked())
      {
        rbTextResult.setText("Prefiro a cor Verde");
        rbTextResult.setTextColor(Color.GREEN);
      }
      if (radio_red.isChecked()) {
        rbTextResult.setText("Prefiro a cor Vermelha");
        rbTextResult.setTextColor(Color.RED);
      }
    });
  }
}