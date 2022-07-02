package com.matrix_maeny.calculator.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import org.mariuszgromada.math.mxparser.*;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.matrix_maeny.calculator.R;
import com.matrix_maeny.calculator.databinding.ActivityMultiplicationMatrixBinding;

import java.security.SecureRandom;

public class MultiplicationMatrixActivity extends AppCompatActivity {

    Toolbar matrixMulToolbar;
    ActivityMultiplicationMatrixBinding binding;

    double[][] matrix1 = new double[3][3];
    double[][] matrix2 = new double[3][3];
    double[][] product = new double[3][3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMultiplicationMatrixBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        matrixMulToolbar = findViewById(R.id.matrixMulToolbar);
        matrixMulToolbar.setTitle("Matrix multiplication");

        initializeMatrix(matrix1);
        initializeMatrix(matrix2);
        initializeMatrix(product);

        binding.MulEqualBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTheValues();
                  fillTheValuesInMatrix();
                setTheProduct();
                setTheProductToMatrix();

            }
        });

    }

    void setTheValueToZero(@NonNull EditText editText) {

        if (editText.getText().toString().equals("")) {
            editText.setText("0");
        }

    }

    void setTheValues() {
        setTheValueToZero(binding.matrix111);
        setTheValueToZero(binding.matrix112);
        setTheValueToZero(binding.matrix113);
        setTheValueToZero(binding.matrix121);
        setTheValueToZero(binding.matrix122);
        setTheValueToZero(binding.matrix123);
        setTheValueToZero(binding.matrix131);
        setTheValueToZero(binding.matrix132);
        setTheValueToZero(binding.matrix133);

        setTheValueToZero(binding.matrix211);
        setTheValueToZero(binding.matrix212);
        setTheValueToZero(binding.matrix213);
        setTheValueToZero(binding.matrix221);
        setTheValueToZero(binding.matrix222);
        setTheValueToZero(binding.matrix223);
        setTheValueToZero(binding.matrix231);
        setTheValueToZero(binding.matrix232);
        setTheValueToZero(binding.matrix233);


    }

    double getTheValue(@NonNull EditText textView) {

        String evalValue = textView.getText().toString();
        Expression evalExpre = new Expression(evalValue);
        evalValue = String.valueOf(evalExpre.calculate());

        if (evalValue.equals("NaN")) {
            evalValue = "0";
        }

        return Double.parseDouble(evalValue);

    }

    void initializeMatrix(double[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    void setTheProduct() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                product[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        //set the values..
    }

    void fillTheValuesInMatrix() {
        matrix1[0][0] = getTheValue(binding.matrix111);
        matrix1[0][1] = getTheValue(binding.matrix112);
        matrix1[0][2] = getTheValue(binding.matrix113);
        matrix1[1][0] = getTheValue(binding.matrix121);
        matrix1[1][1] = getTheValue(binding.matrix122);
        matrix1[1][2] = getTheValue(binding.matrix123);
        matrix1[2][0] = getTheValue(binding.matrix131);
        matrix1[2][1] = getTheValue(binding.matrix132);
        matrix1[2][2] = getTheValue(binding.matrix133);

        //second matrix

        matrix2[0][0] = getTheValue(binding.matrix211);
        matrix2[0][1] = getTheValue(binding.matrix212);
        matrix2[0][2] = getTheValue(binding.matrix213);
        matrix2[1][0] = getTheValue(binding.matrix221);
        matrix2[1][1] = getTheValue(binding.matrix222);
        matrix2[1][2] = getTheValue(binding.matrix223);
        matrix2[2][0] = getTheValue(binding.matrix231);
        matrix2[2][1] = getTheValue(binding.matrix232);
        matrix2[2][2] = getTheValue(binding.matrix233);


    }

    void setTheProductToMatrix(){
        binding.mulResult11.setText(String.valueOf(product[0][0]));
        binding.mulResult12.setText(String.valueOf(product[0][1]));
        binding.mulResult13.setText(String.valueOf(product[0][2]));
        binding.mulResult21.setText(String.valueOf(product[1][0]));
        binding.mulResult22.setText(String.valueOf(product[1][1]));
        binding.mulResult23.setText(String.valueOf(product[1][2]));
        binding.mulResult31.setText(String.valueOf(product[2][0]));
        binding.mulResult32.setText(String.valueOf(product[2][1]));
        binding.mulResult33.setText(String.valueOf(product[2][2]));
    }


}