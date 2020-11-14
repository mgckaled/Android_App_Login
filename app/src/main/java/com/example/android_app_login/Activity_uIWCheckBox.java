package com.example.android_app_login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Activity_uIWCheckBox extends AppCompatActivity {

  private Toast toastCB;
  private CheckBox cbCPlus, cbJava, cbJS, cbPython;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_u_i_w_check_box);

    // Set toolbar title
    this.setTitle("CheckBox");

    // Set arrow back on top toolbar
    Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

    Button buttonCB = findViewById(R.id.btnCbEnviar);
    cbCPlus = findViewById(R.id.cb_CPlus);
    cbJava = findViewById(R.id.cb_Java);
    cbJS = findViewById(R.id.cb_JS);
    cbPython = findViewById(R.id.cb_Python);

    buttonCB.setOnClickListener(view -> {
      if (toastCB != null)
        toastCB.cancel();

      String resultCB = "C++: " + cbCPlus.isChecked()
          + "\nJava: " + cbJava.isChecked()
          + "\nJavaScript: " + cbJS.isChecked()
          + "\nPython: " + cbPython.isChecked();

      toastCB = Toast.makeText(getApplicationContext(), resultCB, Toast.LENGTH_LONG);
      toastCB.show();
    });

  }
}
