package com.matrix_maeny.calculator.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.matrix_maeny.calculator.MainActivity;
import com.matrix_maeny.calculator.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread thrd = new Thread() {
            public void run() {
                try {
                    sleep(2250);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intnt = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intnt);
                    finish();

                }
            }
        };
        thrd.start();
    }
}