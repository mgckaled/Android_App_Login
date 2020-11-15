package com.example.android_app_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Objects;

public class Activity_uIWSpinner extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_u_i_w_spinner);

    // Set toolbar title
    this.setTitle("Spinner");

    // Set arrow back on top toolbar
    Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

    Button btnDefineDayWeek = findViewById(R.id.spBtnDefine);
    final TextView sptxtResult = findViewById(R.id.spTextResult);
    final Spinner spSpinner = findViewById(R.id.spWeekDay);

    String[] WeekDays = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
    ArrayAdapter<String> spAdapter = new ArrayAdapter<>(this,
        R.layout.support_simple_spinner_dropdown_item, WeekDays);
    spSpinner.setAdapter(spAdapter);

    btnDefineDayWeek.setOnClickListener(view ->
        sptxtResult.setText("Dia da semana: " +spSpinner.getSelectedItem()));
  }
}