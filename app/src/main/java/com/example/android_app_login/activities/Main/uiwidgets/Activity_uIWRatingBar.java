package com.example.android_app_login.activities.Main.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.android_app_login.R;

import java.util.Objects;

public class Activity_uIWRatingBar extends AppCompatActivity {

    Toast toastBtnRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i_w_rating_bar);

        // Set toolbar title
        this.setTitle("Rating Bar");

        // Set arrow back on top toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // Assing variable to views (.xml files)
        final RatingBar ratingBar = findViewById(R.id.auiw_ratingbar);
        Button btnRatingBar = findViewById(R.id.btnSubmitRating);

        // Define number of stars.
        ratingBar.setRating(5);

        // Define action on click Button
        btnRatingBar.setOnClickListener(view -> {
            if (toastBtnRating != null)
                toastBtnRating.cancel();

            // Math.round() to convert float into int
            if (Math.round(ratingBar.getRating()) == 1) {
                Toast.makeText(getApplicationContext(),
                        "Sua avaliação foi de " + Math.round(ratingBar.getRating()) + " estrela.",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(),
                    "Sua avaliação foi de " + Math.round(ratingBar.getRating()) + " estrelas.",
                    Toast.LENGTH_SHORT).show();
            }

        });

    }
}