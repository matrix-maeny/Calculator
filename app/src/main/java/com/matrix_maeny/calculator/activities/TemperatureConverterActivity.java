package com.matrix_maeny.calculator.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.matrix_maeny.calculator.R;
import com.matrix_maeny.calculator.fragments.BottomUnitsFragment;
import com.matrix_maeny.calculator.fragments.TemperatureConverterFragment;
import com.matrix_maeny.calculator.fragments.TimeConverterFragment;

import org.mariuszgromada.math.mxparser.*;

import org.w3c.dom.Text;

public class TemperatureConverterActivity extends AppCompatActivity implements TemperatureConverterFragment.BottomFragmentListner {

    Toolbar commonToolbar;
    public AppCompatButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bAc, bDel, bSign, bDot;
    public AppCompatButton bUnit1, bUnit2;
    TextView bText1, bText2;
    ConverterFunctions converterFunction;

    void buttonClickListner(@NonNull AppCompatButton btn, int btnNumber) {

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sizeMinimizer(bText1);
                sizeMinimizer(bText2);
                if (bText1.getText().toString().equals("0")) {
                    bText1.setText("");
                }
                switch (btnNumber) {
                    case 0:
                        bText1.setText(bText1.getText().toString().concat("0"));
                        break;
                    case 1:
                        bText1.setText(bText1.getText().toString().concat("1"));
                        break;
                    case 2:
                        bText1.setText(bText1.getText().toString().concat("2"));
                        break;
                    case 3:
                        bText1.setText(bText1.getText().toString().concat("3"));
                        break;
                    case 4:
                        bText1.setText(bText1.getText().toString().concat("4"));
                        break;
                    case 5:
                        bText1.setText(bText1.getText().toString().concat("5"));
                        break;
                    case 6:
                        bText1.setText(bText1.getText().toString().concat("6"));
                        break;
                    case 7:
                        bText1.setText(bText1.getText().toString().concat("7"));
                        break;
                    case 8:
                        bText1.setText(bText1.getText().toString().concat("8"));
                        break;
                    case 9:
                        bText1.setText(bText1.getText().toString().concat("9"));
                        break;
                    case 10:
                        if (bText1.getText().toString().equals("")) {
                            bText1.setText("0");
                        }
                        bText1.setText(bText1.getText().toString().concat("."));
                        break;
                    case 11:
                        bText1.setText("0");
                        bText2.setText("0");
                        break;
                    case 12:
                        delBtnFunction(bText1);
                        break;
                    case 13:
                        bText1.setText(bText1.getText().toString().concat("-"));
                        break;
                }
                evaluateFunction(getTheValue(bText1));
                sizeMinimizer(bText1);
                sizeMinimizer(bText2);

            }
        });
    }

    void delBtnFunction(@NonNull TextView tvMain) { // delete funtion
        if (!tvMain.getText().toString().equals("")) { // checking wheather the box is empty or not (it should not empty)

            String tempText = tvMain.getText().toString(); // getting the text

            if (tempText.length() != 1) {                           //checking if there is only one character in the box ( it should not be one character)
                tvMain.setText(tempText.substring(0, tempText.length() - 1)); // deleting the last character
            } else {
                tvMain.setText("0");
            }

        } else {
            tvMain.setText("0");  // if the box is empty set to zero 0
        }
    }

    void sizeMinimizer(@NonNull TextView textView) {
        if (textView.getText().toString().length() >= 12) {
            textView.setTextSize(20);
        } else {
            textView.setTextSize(34);
        }
        if (textView.getText().toString().length() >= 20) {
            textView.setTextSize(14);
        }


    }

    void evaluateFunction(double val) {
        String btnUnit1Text = bUnit1.getText().toString();
        String btnUnit2Text = bUnit2.getText().toString();

        double result = converterFunction.TemperatureEvaluationFunction(btnUnit1Text, btnUnit2Text, val);
        bText2.setText(String.valueOf(result));
    }
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.commonconverter_layout);
        getSupportActionBar().hide();
        converterFunction = new ConverterFunctions();


        commonToolbar = findViewById(R.id.commonToolbar);
        commonToolbar.setTitle("Temperature converter");


        bUnit1 = findViewById(R.id.aBUnit1);
        bUnit1.setText("°C");
        bUnit2 = findViewById(R.id.aBUnit2);
        bUnit2.setText("°C");

        bText1 = findViewById(R.id.aBText1);
        bText2 = findViewById(R.id.aBText2);

        b0 = findViewById(R.id.aB0);
        b1 = findViewById(R.id.aB1);
        b2 = findViewById(R.id.aB2);
        b3 = findViewById(R.id.aB3);
        b4 = findViewById(R.id.aB4);
        b5 = findViewById(R.id.aB5);
        b6 = findViewById(R.id.aB6);
        b7 = findViewById(R.id.aB7);
        b8 = findViewById(R.id.aB8);
        b9 = findViewById(R.id.aB9);
        bAc = findViewById(R.id.abAC);
        bDel = findViewById(R.id.aBDel);
        bSign = findViewById(R.id.aBSign);
        bSign.setVisibility(View.VISIBLE);
        bDot = findViewById(R.id.aBpoint);


        bUnit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bUnit1.setBackgroundResource(R.drawable.button_background1);
                bUnit2.setBackgroundResource(R.drawable.button_background3);
                openDialog(1);
                sizeMinimizer(bText1);
                sizeMinimizer(bText2);

            }
        });
        bUnit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bUnit1.setBackgroundResource(R.drawable.button_background3);
                bUnit2.setBackgroundResource(R.drawable.button_background1);
                openDialog(2);
                sizeMinimizer(bText1);
                sizeMinimizer(bText2);
            }
        });

        // setting button click listner to all buttons
        buttonClickListner(b0, 0);
        buttonClickListner(b1, 1);
        buttonClickListner(b2, 2);
        buttonClickListner(b3, 3);
        buttonClickListner(b4, 4);
        buttonClickListner(b5, 5);
        buttonClickListner(b6, 6);
        buttonClickListner(b7, 7);
        buttonClickListner(b8, 8);
        buttonClickListner(b9, 9);
        buttonClickListner(bDot, 10);
        buttonClickListner(bAc, 11);
        buttonClickListner(bDel, 12);
        buttonClickListner(bSign,13);
    }

    public void openDialog(int flag) {

        TemperatureConverterFragment bottomUnitsFragment = new TemperatureConverterFragment(bText1, bText2, flag);
        bottomUnitsFragment.show(getSupportFragmentManager(), "select units");
    }

    double getTheValue(@NonNull TextView textView) {

        String evalValue = textView.getText().toString();
        Expression evalExpre = new Expression(evalValue);
        evalValue = String.valueOf(evalExpre.calculate());

        if (evalValue.equals("NaN")) {
            evalValue = "0";
        }

        return Double.parseDouble(evalValue);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void setButtonTexts(String texts, int flag) {
        if (flag == 1) {
            bUnit1.setText(texts);

        } else {
            bUnit2.setText(texts);
        }

        evaluateFunction(getTheValue(bText1));
        sizeMinimizer(bText1);
        sizeMinimizer(bText2);
    }
}