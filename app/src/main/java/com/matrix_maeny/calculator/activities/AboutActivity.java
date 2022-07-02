package com.matrix_maeny.calculator.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.matrix_maeny.calculator.R;

public class AboutActivity extends AppCompatActivity {

    Toolbar aboutToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().hide();

        aboutToolbar = findViewById(R.id.aboutToolbar);
        aboutToolbar.setTitle("About");

    }
}