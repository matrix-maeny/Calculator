package com.matrix_maeny.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Toast;

import com.matrix_maeny.calculator.activities.AboutActivity;
import com.matrix_maeny.calculator.adapters.ActivityAdapter;
import com.matrix_maeny.calculator.models.ActivityModel;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    WebView webView;
    RecyclerView recyclerView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Calculator");

        recyclerView = findViewById(R.id.recyclerView);


        ArrayList<ActivityModel> list = new ArrayList<>();

        list.add(new ActivityModel(R.drawable.calculator_icon, "Calculator"));
        list.add(new ActivityModel(R.drawable.converter1, "Converter"));
        list.add(new ActivityModel(R.drawable.life, "Daily Life"));
        list.add(new ActivityModel(R.drawable.matrix3, "Matrices"));


        ActivityAdapter adapter = new ActivityAdapter(list, MainActivity.this);
        recyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        Intent intnt = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intnt);

        return super.onOptionsItemSelected(item);
    }


}