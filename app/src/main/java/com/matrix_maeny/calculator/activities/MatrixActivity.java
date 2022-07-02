package com.matrix_maeny.calculator.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AbsListView;

import com.matrix_maeny.calculator.R;
import com.matrix_maeny.calculator.adapters.ConverterAdapter;
import com.matrix_maeny.calculator.models.ActivityModel;

import java.util.ArrayList;

public class MatrixActivity extends AppCompatActivity {

    Toolbar matrixToolbar;
    RecyclerView matrixRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix);
        getSupportActionBar().hide();

        matrixToolbar = findViewById(R.id.matrixToolbar);
        matrixToolbar.setTitle("Matrices");
        matrixToolbar.setElevation(50);

        matrixRecyclerView = findViewById(R.id.matrixRecyclerView);

        ArrayList<ActivityModel> list = new ArrayList<>();

        list.add(new ActivityModel(R.drawable.multiplication,"Multiplication"));
        list.add(new ActivityModel(R.drawable.matrix3,"Adj/Inv"));



        ConverterAdapter adapter = new ConverterAdapter(list, MatrixActivity.this,"MatrixActivity");
        matrixRecyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MatrixActivity.this,3);
        matrixRecyclerView.setLayoutManager(gridLayoutManager);
    }
}