package com.matrix_maeny.calculator.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.matrix_maeny.calculator.R;
import com.matrix_maeny.calculator.databinding.ActivityMatrixAdjointBinding;

import org.mariuszgromada.math.mxparser.Expression;

public class MatrixAdjointActivity extends AppCompatActivity {

    Toolbar adjointToolbar;
    ActivityMatrixAdjointBinding binding;

    double[][] matrix = new double[3][3];
    double[][] adjointMatrix = new double[3][3];
    double[][] inverseMatrix = new double[3][3];

    boolean flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMatrixAdjointBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        adjointToolbar = findViewById(R.id.adjointToolbar);
        adjointToolbar.setTitle("Adjoint/Inverse calculator");


        initializeMatrix(matrix);
        initializeMatrix(adjointMatrix);
        initializeMatrix(inverseMatrix);
//    calling adjoint button
        binding.adjEqualBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                if (!false) {
                    setTheValues();
                    fillTheValuesInMatrix();
                    findTheAdjoint();
                    setTheAdjointToMatrix();

                    flag = true;
                } else {
                    setTheAdjointToMatrix();
                }
                binding.resultText.setText("Adjoint Matrix");


            }
        });

        // calling inverse button
         binding.adjInverseBtn.setOnClickListener(new View.OnClickListener() {
             @SuppressLint("SetTextI18n")
             @Override
             public void onClick(View v) {
                 if (!flag) {
                     setTheValues();
                     fillTheValuesInMatrix();
                     findTheAdjoint();
                     findTheInverse();
                     setTheInverseToMatrix();

                     flag = true;
                 } else {
                     findTheInverse();
                     setTheInverseToMatrix();
                 }
                 binding.resultText.setText("Inverse Matrix");
             }
         });
    }

    void setTheValueToZero(@NonNull EditText editText) {

        if (editText.getText().toString().equals("")) {
            editText.setText("0");
        }

    }
    void initializeMatrix(double[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = 0;
            }
        }
    }
    void setTheValues() {
        setTheValueToZero(binding.adjMatrix11);
        setTheValueToZero(binding.adjMatrix12);
        setTheValueToZero(binding.adjMatrix13);
        setTheValueToZero(binding.adjMatrix21);
        setTheValueToZero(binding.adjMatrix22);
        setTheValueToZero(binding.adjMatrix23);
        setTheValueToZero(binding.adjMatrix31);
        setTheValueToZero(binding.adjMatrix32);
        setTheValueToZero(binding.adjMatrix33);



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

    void fillTheValuesInMatrix() {
        matrix[0][0] = getTheValue(binding.adjMatrix11);
        matrix[0][1] = getTheValue(binding.adjMatrix12);
        matrix[0][2] = getTheValue(binding.adjMatrix13);
        matrix[1][0] = getTheValue(binding.adjMatrix21);
        matrix[1][1] = getTheValue(binding.adjMatrix22);
        matrix[1][2] = getTheValue(binding.adjMatrix23);
        matrix[2][0] = getTheValue(binding.adjMatrix31);
        matrix[2][1] = getTheValue(binding.adjMatrix32);
        matrix[2][2] = getTheValue(binding.adjMatrix33);

        //second matrix


    }

    void findTheAdjoint(){
        adjointMatrix[0][0] = (matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]);
        adjointMatrix[0][1] = (matrix[2][1] * matrix[0][2]) - (matrix[0][1] * matrix[2][1]);
        adjointMatrix[0][2] = (matrix[0][1] * matrix[1][2]) - (matrix[0][2] * matrix[1][1]);
        adjointMatrix[1][0] = (matrix[2][0] * matrix[1][2]) - (matrix[1][0] * matrix[2][2]);
        adjointMatrix[1][1] = (matrix[0][0] * matrix[2][2]) - (matrix[2][0] * matrix[0][2]);
        adjointMatrix[1][2] = (matrix[0][2] * matrix[1][0]) - (matrix[1][2] * matrix[0][0]);
        adjointMatrix[2][0] = (matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]);
        adjointMatrix[2][1] = (matrix[2][0] * matrix[0][1]) - (matrix[0][0] * matrix[2][1]);
        adjointMatrix[2][2] = (matrix[1][1] * matrix[0][0]) - (matrix[0][1] * matrix[1][0]);

    }
    void setTheAdjointToMatrix(){
        binding.adjResult11.setText(String.valueOf(adjointMatrix[0][0]));
        binding.adjResult12.setText(String.valueOf(adjointMatrix[0][1]));
        binding.adjResult13.setText(String.valueOf(adjointMatrix[0][2]));
        binding.adjResult21.setText(String.valueOf(adjointMatrix[1][0]));
        binding.adjResult22.setText(String.valueOf(adjointMatrix[1][1]));
        binding.adjResult23.setText(String.valueOf(adjointMatrix[1][2]));
        binding.adjResult31.setText(String.valueOf(adjointMatrix[2][0]));
        binding.adjResult32.setText(String.valueOf(adjointMatrix[2][1]));
        binding.adjResult33.setText(String.valueOf(adjointMatrix[2][2]));
    }

    @SuppressLint("DefaultLocale")
    void setTheInverseToMatrix(){
        binding.adjResult11.setText(String.format("%.2f",inverseMatrix[0][0]));
        binding.adjResult12.setText(String.format("%.2f",inverseMatrix[0][1]));
        binding.adjResult13.setText(String.format("%.2f",inverseMatrix[0][2]));
        binding.adjResult21.setText(String.format("%.2f",inverseMatrix[1][0]));
        binding.adjResult22.setText(String.format("%.2f",inverseMatrix[1][1]));
        binding.adjResult23.setText(String.format("%.2f",inverseMatrix[1][2]));
        binding.adjResult31.setText(String.format("%.2f",inverseMatrix[2][0]));
        binding.adjResult32.setText(String.format("%.2f",inverseMatrix[2][1]));
        binding.adjResult33.setText(String.format("%.2f",inverseMatrix[2][2]));
    }

    void findTheInverse(){

        double detOfMatrix1 = (matrix[0][0]*matrix[1][1]*matrix[2][2]) + (matrix[0][1]*matrix[1][2]*matrix[2][0]) + (matrix[0][2]*matrix[1][0]*matrix[2][1]);
        double detOfMatrix2 = (matrix[2][0]*matrix[1][1]*matrix[0][2]) + (matrix[2][1]*matrix[1][2]*matrix[0][0]) + (matrix[2][2]*matrix[1][0]*matrix[0][1]);
        double det = detOfMatrix1 - detOfMatrix2;

        if (det != 0) {
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    inverseMatrix[i][j] = adjointMatrix[i][j]/det;
                }
            }
        } else {
            Toast.makeText(MatrixAdjointActivity.this, "Determinant of matrix is zero", Toast.LENGTH_SHORT).show();
        }

    }
}