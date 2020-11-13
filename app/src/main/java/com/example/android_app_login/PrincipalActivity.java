package com.example.android_app_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    // Listview
    ListView listView;
    // Data to be displayed into list
    String[] uIWidgets = {
            "TextView", "EditView", "Button", "Checkbox", "RadioButton", "Spinner",
            "Switch", "ToggleButton", "ImageButton", "RatingBar", "SeekBar", "AlertDialog",
            "AutocompleteTextView", "ImageSwitcher", "TextSwitcher", "AdapterViewFlipper"
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

        ListAdapter adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, uIWidgets);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(view.getContext(),Activity_uIWTextView.class);
                    startActivity(intent);
                }
            }
        });
    }
}