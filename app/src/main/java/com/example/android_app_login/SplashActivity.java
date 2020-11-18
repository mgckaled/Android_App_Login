package com.example.android_app_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Remover a Barra do Activity
        getSupportActionBar().hide();

        // Criar nova Thread para incluir tempo de exibição da SplashView
        new Thread(() -> {

            SystemClock.sleep(4000); // 4 segundos
            Intent intentSplash = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intentSplash);
            finish(); // chamar método onDestroy() -> a tela Splash não retornará mais

        }).start();
    }
}