package com.matrix_maeny.calculator.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.matrix_maeny.calculator.MainActivity;
import com.matrix_maeny.calculator.R;
import com.matrix_maeny.calculator.adapters.ActivityAdapter;
import com.matrix_maeny.calculator.adapters.ConverterAdapter;
import com.matrix_maeny.calculator.models.ActivityModel;

import java.util.ArrayList;

public class ConverterActivity extends AppCompatActivity {

        RecyclerView cnvtrRecyclerView;
        Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        getSupportActionBar().hide();

        toolbar = findViewById(R.id.cnvtrToolbar);
        cnvtrRecyclerView = findViewById(R.id.cnvtrRecyclerView);

        toolbar.setTitle("Converter");


        ArrayList<ActivityModel> list = new ArrayList<>();

        list.add(new ActivityModel(R.drawable.area,"Area"));
        list.add(new ActivityModel(R.drawable.length,"Length"));
        list.add(new ActivityModel(R.drawable.volume,"Volume"));
        list.add(new ActivityModel(R.drawable.temp,"Temperature"));
        list.add(new ActivityModel(R.drawable.speedometer,"Speed"));
        list.add(new ActivityModel(R.drawable.time,"Time"));
        list.add(new ActivityModel(R.drawable.weight,"Weight"));
        list.add(new ActivityModel(R.drawable.cpu,"Data"));


        ConverterAdapter adapter = new ConverterAdapter(list, ConverterActivity.this,"ConverterActivity");
        cnvtrRecyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(ConverterActivity.this,3);
        cnvtrRecyclerView.setLayoutManager(gridLayoutManager);
    }
}