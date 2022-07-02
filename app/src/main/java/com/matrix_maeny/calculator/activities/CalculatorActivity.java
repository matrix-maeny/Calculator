package com.matrix_maeny.calculator.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.SuperscriptSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassificationManager;
import android.widget.TextView;
import android.widget.Toast;

import com.matrix_maeny.calculator.R;
import com.matrix_maeny.calculator.databinding.ActivityCalculatorBinding;

import org.mariuszgromada.math.mxparser.*;
import org.w3c.dom.Text;


public class CalculatorActivity extends AppCompatActivity implements NumberFormatDialog.NumberFormatDialogListner {

    ActivityCalculatorBinding binding;

    int oBra = 0, cBra = 0;
    String txtForm = "";
    boolean trigFlag = false, checkDeg = true;
    int equalFlag = 0;
    int numberFlag = 0;
    double knownResult = 0;
    ConverterFunctions converterFunctions;


    void buttonOnClickListner(@NonNull AppCompatButton btn, TextView tvMain, int n) {

        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                equalFlag = equalButtonFunctionMain(0); // continuous evaluaion of the expresion

                String tvResultText = ""; // temporary string

                if (tvMain.getText().toString().equals("0")) { // if the box contains 0 .. then set to empty to fill the presssed number
                    tvMain.setText("");
                }
                if (!(binding.tvResult.getText().toString().equals(""))) { // if result is not empty.. then store in tvResultText
                    tvResultText = binding.tvResult.getText().toString();
                }
                switch (n) {        // considering button numbers
                    case 0:
                        tvMain.setText(tvMain.getText().toString().concat("0"));
                        break;
                    case 1:
                        tvMain.setText(tvMain.getText().toString().concat("1"));
                        break;
                    case 2:
                        tvMain.setText(tvMain.getText().toString().concat("2"));
                        break;
                    case 3:
                        tvMain.setText(tvMain.getText().toString().concat("3"));
                        break;
                    case 4:
                        tvMain.setText(tvMain.getText().toString().concat("4"));
                        break;
                    case 5:
                        tvMain.setText(tvMain.getText().toString().concat("5"));
                        break;
                    case 6:
                        tvMain.setText(tvMain.getText().toString().concat("6"));
                        break;
                    case 7:
                        tvMain.setText(tvMain.getText().toString().concat("7"));
                        break;
                    case 8:
                        tvMain.setText(tvMain.getText().toString().concat("8"));
                        break;
                    case 9:
                        tvMain.setText(tvMain.getText().toString().concat("9"));
                        break;
                    case 10:
                        if (tvMain.getText().toString().equals("")) {
                            tvMain.setText("0");
                        }
                        tvMain.setText(tvMain.getText().toString().concat("."));
                        break;
                    case 11:
                        equalFlag = equalButtonFunctionMain(1); // function with another flag to set the sizes and colors of views
                        break;
                    case 12:
                        operatorFunction(tvMain, "+"); // seperate function for operator concatanation
                        break;
                    case 13:
                        operatorFunction(tvMain, "-");
                        break;
                    case 14:
                        operatorFunction(tvMain, "x");
                        break;
                    case 15:
                        operatorFunction(tvMain, "/");
                        break;
                    case 16:                                // clearing all in the boxes
                        equalButtonFunctionMain(3);

                        break;
                    case 17:
                        delBtnFunction(tvMain); // delete funtion
                        break;
                    case 18:
                        piBracketOperator(tvMain, "(");   // seperate function for special operators and functions
                        break;
                    case 19:
                        if (!tvMain.getText().toString().equals("")) {
                            tvMain.setText(tvMain.getText().toString().concat(")"));
                        } else {
                            tempToast("Can't add closed bracket without an expression");
                        }
                        break;
                    case 20:
//                        piBracketOperator(tvMain, "3.1415926535");
                        piBracketOperator(tvMain, "π");
                        break;
                    case 21:
                        piBracketOperator(tvMain, "e");
                        break;
                    case 22:
                        piBracketOperator(tvMain, "sqrt(");
                        break;
                    case 23:
                        operatorFunction(tvMain, "^");
                        break;
                    case 24:
                        operatorFunction(tvMain, "!");
                        break;
                    case 25:
                        piBracketOperator(tvMain, "log(");
                        break;
                    case 26:
                        piBracketOperator(tvMain, "ln(");
                        break;
                    case 27:                                                        // flag for changing the inverse funtions on the buttons and functoins
                        if (trigFlag) {
                            piBracketOperator(tvMain, "arcsin(");
                        } else {
                            piBracketOperator(tvMain, "sin(");
                        }
                        break;
                    case 28:
                        if (trigFlag) {
                            piBracketOperator(tvMain, "arccos(");
                        } else {
                            piBracketOperator(tvMain, "cos(");
                        }
                        break;
                    case 29:
                        if (trigFlag) {
                            piBracketOperator(tvMain, "arctan(");
                        } else {
                            piBracketOperator(tvMain, "tan(");
                        }
                        break;
                    case 30:                              // setting the flag for the inverse funtions
                        trigFlag = !trigFlag;
                        changeButtonNames(trigFlag);   // change function to change button states
                        break;
                    case 31:
                        if (checkDeg) {
                            mXparser.setRadiansMode();
                            binding.degToRad.setText("rad");
                        } else {
                            mXparser.setDegreesMode();
                            binding.degToRad.setText("deg");
                        }
                        checkDeg = !checkDeg;

                        break;


                }
                if (tvMain.getText().toString().equals("")) {
                    tvMain.setText("0");
                }


                equalButtonFunction();


                if (equalFlag == 1) {
                    equalButtonFunctionMain(1);
                }


            }
        });
    }

    @SuppressLint("SetTextI18n")
    void changeButtonNames(boolean trigFlag) { // for changing the trigonometric buttons to inverse functions
        if (trigFlag) {
            binding.bSin.setText(R.string.sinInverse);
            binding.bCos.setText(R.string.cosInverse);
            binding.bTan.setText(R.string.tanInverse);
        } else {
            binding.bSin.setText("sin");
            binding.bCos.setText("cos");
            binding.bTan.setText("tan");
        }
    }

    void piBracketOperator(@NonNull TextView tvMain, String op) { // for only special function which can be operable in braces




        if (tvMain.getText().toString().equals("")) { // if the box is empty ..set to zero
            tvMain.setText("0");
        }
        String tempText = tvMain.getText().toString(); // getting the text
        int lngth = tempText.length(); //finding the length of the text
        tempText = tempText.substring(lngth - 1);   // taking the last character into the tempText

        if (op.equals("(") && tempText.equals("(")) {
            tvMain.setText(tvMain.getText().toString().concat("("));
        }

        // if that char is open brace and the function is any one of these.. then set it in the text box
        else if (tempText.equals("(") && (op.equals("sqrt(") || op.equals("π") || op.equals("e") || op.equals("sin(") || op.equals("cos(") || op.equals("tan(") || op.equals("arcsin(") || op.equals("arccos(") || op.equals("arctan(") || op.equals("log(") || op.equals("ln("))) {

            tvMain.setText(tvMain.getText().toString().concat(op));

            //else if that char is an operator or zero..
        } else if (tempText.equals("+") || tempText.equals("-") || tempText.equals("x") || tempText.equals("/") || tempText.equals("0")) {
            if (tvMain.getText().toString().equals("0")) { // check if it is zero or not
                tvMain.setText(""); // set empty if it is zero
            }
            tvMain.setText(tvMain.getText().toString().concat(op)); // finally concate the operator
        } else {



            tempToast("Use +,-,/,x or a number or a function\nbefore using ".concat(op)); // setting toast for showing error
        }
    }


    void findNoOfBrackets() { // for finding the no of brackets in the expression
        oBra = 0;
        cBra = 0;
        for (int i = 0; i < binding.tvMain.getText().toString().length(); i++) {
            if (binding.tvMain.getText().toString().charAt(i) == '(') {
                oBra += 1;
            }
            if (binding.tvMain.getText().toString().charAt(i) == ')') {
                cBra += 1;
            }

        }
    }

    void tempToast(String m) { // temperory toast
        Toast.makeText(CalculatorActivity.this, m, Toast.LENGTH_LONG).show();
    }

    void delBtnFunction(@NonNull TextView tvMain) { // delete funtion

        if(tvMain.getText().toString().endsWith("(")){
           String temptext = tvMain.getText().toString(); // initializing the tempText .. because we need to set if nothing matches

            if(temptext.endsWith("arcsin(")){
                temptext = tvMain.getText().toString().replaceAll("arcsin\\(","");
            }else if(temptext.endsWith("arccos(")){
                temptext = tvMain.getText().toString().replaceAll("arccos\\(","");
            }else if(temptext.endsWith("arctan(")){
                temptext = tvMain.getText().toString().replaceAll("arctan\\(","");
            }else if(temptext.endsWith("log(")){
                temptext = tvMain.getText().toString().replaceAll("log\\(","");
            }else if(temptext.endsWith("ln(")){
                temptext = tvMain.getText().toString().replaceAll("ln\\(","");
            }else if(temptext.endsWith("sqrt(")){
                temptext = tvMain.getText().toString().replaceAll("sqrt\\(","");
            }else if(temptext.endsWith("sin(")){
                temptext = tvMain.getText().toString().replaceAll("sin\\(","");
            }else if(temptext.endsWith("cos(")){
                temptext = tvMain.getText().toString().replaceAll("cos\\(","");
            }else if(temptext.endsWith("tan(")){
                temptext = tvMain.getText().toString().replaceAll("tan\\(","");
            }else{
                 // getting the text

                tvMain.setText(temptext.substring(0, temptext.length() - 1));
                return;
            }
            tvMain.setText(temptext);

        }else {

            if (!tvMain.getText().toString().equals("") && tvMain.getText().toString().length() != 1) { // checking wheather the box is empty or not (it should not empty)

                String tempText = tvMain.getText().toString(); // getting the text

                tvMain.setText(tempText.substring(0, tempText.length() - 1));

            } else {
                tvMain.setText("0");  // if the box is empty set to zero 0
            }
        }


    }

    int equalButtonFunctionMain(int flag) {
        //finding no of open brackets
        findNoOfBrackets();

        //setting colors and sizes
        if (flag == 1) {
            binding.tvResult.setTextColor(Color.parseColor("#F3F5F6"));//increasing text color

            binding.tvResult.setTextSize(45);
            binding.tvMain.setTextColor(Color.parseColor("#858080"));// decreasing text color
            binding.tvMain.setTextSize(24);
            // adding close brackets

            int braketNum = oBra - cBra;

            for (int i = 0; i < braketNum; i++) {

                if (oBra != cBra) {
                    binding.tvMain.setText(binding.tvMain.getText().toString().concat(")"));
                }


            }
        } else if (flag == 3) {
            binding.tvMain.setText("0");
            binding.tvResult.setText("");
            binding.tvMain.setTextSize(45);
            binding.tvResult.setTextSize(24);
        } else {
            binding.tvResult.setTextColor(Color.parseColor("#858080")); // decreasing text color
            binding.tvResult.setTextSize(24);
            binding.tvMain.setTextColor(Color.parseColor("#F3F5F6"));//increasing text color
            binding.tvMain.setTextSize(45);


        }

        if (binding.tvResult.getText().toString().length() >= 13) { // setting sizes for result view
            binding.tvResult.setTextSize(24);
        }
        if (binding.tvMain.getText().toString().length() >= 13) { // setting sizes for result view
            binding.tvMain.setTextSize(24);
        }


        return flag;

    }


    // result setting funciton
    @SuppressLint("SetTextI18n")
    void equalButtonFunction() {
        //re-placing complex characters
        String result;

        String expre = binding.tvMain.getText().toString();

        expre = expre.replaceAll("x", "*");
        expre = expre.replaceAll("π", "pi");
        expre = expre.replaceAll("log\\(", "log10(");



        Expression evalExpre = new Expression(expre); // evaluating
        knownResult = evalExpre.calculate();
        result = String.valueOf(knownResult);

        if (numberFlag != 0 && !result.equals("NaN")) {
            if (knownResult < 0) {
                knownResult = knownResult * -1;
            }
            if (ifItisWithoutDecimal(knownResult)) {

                binding.numberFormat.setText(txtForm);
                result = converterFunctions.NumericConverter((long) knownResult, numberFlag);
            } else {
                if (numberFlag == 1) {
                    binding.numberFormat.setText(txtForm);

                    result = converterFunctions.floatToBinary(knownResult);
                } else {
                    numberFlag = 1;
                    txtForm = "Decimal form";
                    binding.numberFormat.setText(txtForm);
                    numberFlag = 0;
                    equalButtonFunction();

                    tempToast("Can't convert decimal values");
                }

            }
        }

        result = "= ".concat(result);          // adding equal symbol to the answer
        if (!result.equals("= NaN")) {               // if it is nan don't print it
            binding.tvResult.setText(result);
        }

        if (binding.tvResult.getText().toString().length() >= 13) { // setting sizes for result view
            binding.tvResult.setTextSize(24);
        }

        if (binding.tvMain.getText().toString().length() >= 13) { // setting sizes for result view
            binding.tvResult.setTextSize(24);
        } else {
            binding.tvMain.setTextSize(45);
        }


    }

    boolean ifItisWithoutDecimal(double r) {

        long r1 = (long) r;
        double r2 = r - r1;

        if (r2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    void operatorFunction(@NonNull TextView tvMain, String op) {
        findNoOfBrackets();                                  //finding the number of open and closed braces
        if (tvMain.getText().toString().equals("")) {       // if the box is empty set to zero
            tvMain.setText("0");
        }

        if (!(binding.tvResult.getText().toString().equals("")) && !(binding.tvResult.getText().toString().substring(2).equals("Infinity")) && (oBra == cBra) && numberFlag == 0) { // set result in the tvMain box if and only if the result box is not empty and the no of open braces is equal to the close braces

            tvMain.setText(binding.tvResult.getText().toString().substring(2));
        }
        if (!tvMain.getText().toString().equals("") && !tvMain.getText().toString().substring(binding.tvMain.getText().toString().length() - 1).equals("(")) { // if the box is not empty in any case .. concate the operator op
            tvMain.setText(binding.tvMain.getText().toString().concat(op));
        } else {
            tempToast("Can't add after Bracket");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityCalculatorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Calculator");          // setting the title
        converterFunctions = new ConverterFunctions();
        mXparser.setDegreesMode();


        //dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);

        // passing the ids and button number to the onclick function
        binding.tvResult.setTextColor(Color.parseColor("#858080")); // decreasing text color
        binding.tvResult.setText("= 0");

        buttonOnClickListner(binding.b0, binding.tvMain, 0);
        buttonOnClickListner(binding.b1, binding.tvMain, 1);
        buttonOnClickListner(binding.b2, binding.tvMain, 2);
        buttonOnClickListner(binding.b3, binding.tvMain, 3);
        buttonOnClickListner(binding.b4, binding.tvMain, 4);
        buttonOnClickListner(binding.b5, binding.tvMain, 5);
        buttonOnClickListner(binding.b6, binding.tvMain, 6);
        buttonOnClickListner(binding.b7, binding.tvMain, 7);
        buttonOnClickListner(binding.b8, binding.tvMain, 8);
        buttonOnClickListner(binding.b9, binding.tvMain, 9);
        buttonOnClickListner(binding.bPoint, binding.tvMain, 10);
        buttonOnClickListner(binding.bResult, binding.tvMain, 11);
        buttonOnClickListner(binding.bAdd, binding.tvMain, 12);
        buttonOnClickListner(binding.bSub, binding.tvMain, 13);
        buttonOnClickListner(binding.bMul, binding.tvMain, 14);
        buttonOnClickListner(binding.bDiv, binding.tvMain, 15);
        buttonOnClickListner(binding.bAc, binding.tvMain, 16);
        buttonOnClickListner(binding.bDel, binding.tvMain, 17);
        buttonOnClickListner(binding.bLbra, binding.tvMain, 18);
        buttonOnClickListner(binding.bRbra, binding.tvMain, 19);

        buttonOnClickListner(binding.bPi, binding.tvMain, 20);
        buttonOnClickListner(binding.bE, binding.tvMain, 21);
        buttonOnClickListner(binding.bRoot, binding.tvMain, 22);
        buttonOnClickListner(binding.bPow, binding.tvMain, 23);
        buttonOnClickListner(binding.bFac, binding.tvMain, 24);
        buttonOnClickListner(binding.bLog, binding.tvMain, 25);
        buttonOnClickListner(binding.bLn, binding.tvMain, 26);
        buttonOnClickListner(binding.bSin, binding.tvMain, 27);
        buttonOnClickListner(binding.bCos, binding.tvMain, 28);
        buttonOnClickListner(binding.bTan, binding.tvMain, 29);
        buttonOnClickListner(binding.b2nd, binding.tvMain, 30);
        buttonOnClickListner(binding.degToRad, binding.tvMain, 31);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        NumberFormatDialog dialog = new NumberFormatDialog();
        dialog.show(getSupportFragmentManager(), "Numbering dialog");

        return true;
    }


    @Override
    public void setTheState(String numForm, int numState) {
        switch (numState) {
            case 0:
                numberFlag = 0;
                binding.numberFormat.setText(numForm);

                break;
            case 1:
                numberFlag = 1;
                break;
            case 2:
                numberFlag = 2;
                break;
            case 3:
                numberFlag = 3;
                break;
        }

        txtForm = numForm;
        equalButtonFunction();

    }
}