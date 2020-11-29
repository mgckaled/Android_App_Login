package com.example.android_app_login.activities.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.android_app_login.R;
import com.example.android_app_login.activities.Main.DateAndTime.DateTimeActivity;
import com.example.android_app_login.activities.Main.Menu.MainMenuActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainCardViewActivity extends AppCompatActivity implements ItemCardAdapter.OnItemListener{

    String[] itemArray = {
            "UI Widgets",
            "Menu",
            "Date and Time",
            "Containers",
            "Multimedia",
            "Material Design",
            "Scientific Calculator"
    };
    int[] photoArray = {
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background
    };
    String[] bottomColors = {
            "#0074D9",
            "#FF4136",
            "#01FF70",
            "#000000",
            "#000000",
            "#000000",
            "#000000"
    };


    List<ItemCardsModel> itemCardsModelList = new ArrayList<>();

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_card_view);

        // Set toolbar title
        this.setTitle("Conteúdo");

        // Set arrow back on top toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recyclerView);

        for (int i=0; i < itemArray.length; i++){

            itemCardsModelList.add(new ItemCardsModel(itemArray[i], photoArray[i], bottomColors[i]));

        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ItemCardAdapter adapter = new ItemCardAdapter(this, itemCardsModelList, this);

        recyclerView.setAdapter(adapter);


    }

    @Override
    public void onItemClick(int position) {
        if (position == 0) {
            Intent intent = new Intent(getApplicationContext(), PrincipalActivity.class);
            startActivity(intent);
        }
        if (position == 1) {
            Intent intent = new Intent(getApplicationContext(), MainMenuActivity.class);
            startActivity(intent);
        }
        if (position == 2) {
            Intent intent = new Intent(getApplicationContext(), DateTimeActivity.class);
            startActivity(intent);
        }
    }
}