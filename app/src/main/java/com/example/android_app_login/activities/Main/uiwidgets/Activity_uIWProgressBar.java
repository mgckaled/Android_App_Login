package com.example.android_app_login.activities.Main.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.android_app_login.R;

import java.util.Objects;

public class Activity_uIWProgressBar extends AppCompatActivity {

    int progressStatus = 0;
    Handler handler = new Handler();
    Toast pb_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i_w_progress_bar);

        // Set toolbar title
        this.setTitle("Progress Bar");

        // Set arrow back on top toolbar
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        //Assimilando variáveis aos elementos view do arquivo .xml
        Button btnHorizontalPB = findViewById(R.id.btn_horizontal_pb);
        final ProgressBar progressHorizontal = findViewById(R.id.h_progress_bar);

        btnHorizontalPB.setOnClickListener(v -> new Thread(() -> {
            while(progressStatus < 100){
                progressStatus += 10; // Adicionar 10 pontos a cada 1000mills (1s)

                handler.post(() -> { // função anônima -> lambda
                    // mostrar barra de progresso sendo preenchida a cada loop
                    progressHorizontal.setProgress(progressStatus);
                    if (progressStatus == 100) {
                        // Deixar barra de progresso completa após término
                        progressHorizontal.setProgress(progressStatus);
                        if (pb_toast != null) {
                            pb_toast.cancel();
                        }
                        // Mostrar aviso após término
                        pb_toast = Toast.makeText(getApplicationContext(),
                                "Progress Complete", Toast.LENGTH_SHORT);
                        pb_toast.show();
                    }
                });
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start());
    }
}