package com.example.android_app_login.activities.Main.uiwidgets;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android_app_login.R;

import java.util.Objects;

public class Activity_uIWEditText extends AppCompatActivity {

    private EditText editText;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i_w_edit_text);

        // Set toolbar title
        this.setTitle("EditText");

        // Set arrow back on top toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        Button buttonEditText = findViewById(R.id.btnEditText);
        editText = findViewById(R.id.etEditText);

        buttonEditText.setOnClickListener(view -> {
            if (toast != null){
                toast.cancel();
            }

            toast = Toast.makeText(getApplicationContext(), editText.getText(),
                    Toast.LENGTH_LONG);
            toast.show();

        });

    }
}