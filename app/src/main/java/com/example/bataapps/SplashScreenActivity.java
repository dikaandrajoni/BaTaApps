package com.example.bataapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i  = new Intent(SplashScreenActivity.this, MainActivity.class); //mengatur perpindahan activity
                startActivity(i);
                finish();
            }
        }, 2000); //untuk mengatur delay splashscreen
    }
}