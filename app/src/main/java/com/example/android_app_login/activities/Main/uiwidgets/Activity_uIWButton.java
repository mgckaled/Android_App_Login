package com.example.android_app_login.activities.Main.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.Toast;

import com.example.android_app_login.R;

import java.util.Objects;

public class Activity_uIWButton extends AppCompatActivity {

 private Toast btn1Toast, btn2Toast;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_u_i_w_button);

    // Set toolbar title
    this.setTitle("Button");

    // Set arrow back on top toolbar
    Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

    Button button1 = findViewById(R.id.btn1);
    Button button2 = findViewById(R.id.btn2);

    button1.setOnClickListener(view -> {
      if (btn1Toast != null)
        btn1Toast.cancel();

      btn1Toast = Toast.makeText(getApplicationContext(),
              "Você clicou no botão 1",
              Toast.LENGTH_SHORT);
      btn1Toast.setGravity(Gravity.TOP,0,-2);
      btn1Toast.show();
    });

    button2.setOnClickListener(view -> {
      if (btn2Toast != null)
        btn2Toast.cancel();

      btn2Toast = Toast.makeText(getApplicationContext(),
              "Você clicou no botão 2",
              Toast.LENGTH_SHORT);
      btn2Toast.setGravity(Gravity.BOTTOM,0,0);
      btn2Toast.show();
    });
  }
}