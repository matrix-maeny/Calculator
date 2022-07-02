package com.matrix_maeny.calculator.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.matrix_maeny.calculator.R;
import com.matrix_maeny.calculator.adapters.ConverterAdapter;
import com.matrix_maeny.calculator.models.ActivityModel;

import java.util.ArrayList;

public class DailyActivity extends AppCompatActivity {

        RecyclerView dailyRecyclerView;
        Toolbar dailyToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);
        getSupportActionBar().hide();

        dailyToolbar = findViewById(R.id.dailyToolbar);
        dailyToolbar.setTitle("Daily life");

        dailyRecyclerView = findViewById(R.id.dailyRecyclerView);

        ArrayList<ActivityModel> list = new ArrayList<>();

        list.add(new ActivityModel(R.drawable.age,"Age"));



        ConverterAdapter adapter = new ConverterAdapter(list, DailyActivity.this,"DailyLifeActivity");
        dailyRecyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(DailyActivity.this,3);
        dailyRecyclerView.setLayoutManager(gridLayoutManager);
    }
}