package com.example.android_app_login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class PrincipalActivity extends AppCompatActivity {

    // Data to be displayed into list
    String[] uIWidgets = {
            "TextView", "EditView", "Button", "Checkbox", "RadioButton", "Spinner",
            "Switch", "ToggleButton", "ImageButton", "RatingBar", "SeekBar", "AlertDialog",
            "AutocompleteTextView", "ImageSwitcher", "TextSwitcher", "AdapterViewFlipper"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        // Set toolbar title
        this.setTitle("UI Widgets");

        // Set arrow back on top toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        /*Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String senha = intent.getStringExtra("senha");*/

        /*Toast.makeText(this,
                "Login realizado com sucesso = " + email,
                Toast.LENGTH_LONG).show();*/

        // associate with the widgets on layout
        // Listview
        ListView listView = findViewById(R.id.listview);

        ListAdapter adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, uIWidgets);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            if (i == 0) {
                Intent intent1 = new Intent(view.getContext(),Activity_uIWTextView.class);
                startActivity(intent1);
            }
            if (i == 1) {
                Intent intent1 = new Intent(view.getContext(),Activity_uIWEditText.class);
                startActivity(intent1);
            }
            if (i == 2) {
                Intent intent1 = new Intent(view.getContext(),Activity_uIWButton.class);
                startActivity(intent1);
            }
            if (i == 3) {
                Intent intent1 = new Intent(view.getContext(),Activity_uIWCheckBox.class);
                startActivity(intent1);
            }
        });
    }
}