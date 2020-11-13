package com.example.android_app_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    // Listview
    ListView listView;
    // Data to be displayed into list
    String[] uIWidgets = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q"
    };
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String senha = intent.getStringExtra("senha");

        Toast.makeText(this,
                "Login realizado com sucesso = " + email,
                Toast.LENGTH_LONG).show();

        // associate with the widgets on layout
        listView = findViewById(R.id.listview);

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, uIWidgets);
        listView.setAdapter(arrayAdapter);
    }
}