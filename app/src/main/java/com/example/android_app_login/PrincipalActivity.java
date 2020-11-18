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

        ListAdapter adapter_lv = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, uIWidgets);

        listView.setAdapter(adapter_lv);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            if (i == 0) {
                Intent intent0 = new Intent(view.getContext(),Activity_uIWTextView.class);
                startActivity(intent0);
            }
            if (i == 1) {
                Intent intent1 = new Intent(view.getContext(),Activity_uIWEditText.class);
                startActivity(intent1);
            }
            if (i == 2) {
                Intent intent2 = new Intent(view.getContext(),Activity_uIWButton.class);
                startActivity(intent2);
            }
            if (i == 3) {
                Intent intent3 = new Intent(view.getContext(),Activity_uIWCheckBox.class);
                startActivity(intent3);
            }
            if (i == 4) {
                Intent intent4 = new Intent(view.getContext(),Activity_uIWRadioButton.class);
                startActivity(intent4);
            }
            if (i == 5) {
                Intent intent5 = new Intent(view.getContext(),Activity_uIWSpinner.class);
                startActivity(intent5);
            }
            if (i == 6) {
                Intent intent6 = new Intent(view.getContext(),Activity_uIWSwitch.class);
                startActivity(intent6);
            }
            if (i == 7) {
                Intent intent7 = new Intent(view.getContext(),Activity_uIWToggleButton.class);
                startActivity(intent7);
            }
        });
    }
}