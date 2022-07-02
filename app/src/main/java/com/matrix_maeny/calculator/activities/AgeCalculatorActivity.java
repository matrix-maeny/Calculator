package com.matrix_maeny.calculator.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


import android.annotation.SuppressLint;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.matrix_maeny.calculator.MainActivity;
import com.matrix_maeny.calculator.R;

import org.joda.time.PeriodType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.logging.Logger;

import org.joda.time.*;

public class AgeCalculatorActivity extends AppCompatActivity {


    Toolbar ageToolbar;
    TextView birthDayDate, currentDate, showYears, showMonths, showDays;

    // birthday dates
    int cm = 0, cd = 0, cy = 0;
    int bm = 0, bd = 0, by = 0;
    int yearc = 0, monthc = 0, dayc = 0;
    Calendar calendar;

    DatePickerDialog.OnDateSetListener birthDateSetListener, currentDateSetListener;


    private DatePickerDialog.OnDateSetListener onDateSetListener;

    @SuppressLint("SetTextI18n")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_calculator);
        getSupportActionBar().hide();



        ageToolbar = findViewById(R.id.ageToolbar);
        ageToolbar.setTitle("Age calculator");

        birthDayDate = findViewById(R.id.birthDayDate);
        currentDate = findViewById(R.id.currentDate);
        showYears = findViewById(R.id.showYears);
        showMonths = findViewById(R.id.showMonths);
        showDays = findViewById(R.id.showDays);
        calendar = Calendar.getInstance();


        setDefaultDate();

        currentDate.setText((dayc) + "/" + (monthc + 1) + "/" + yearc);
        birthDayDate.setText((dayc) + "/" + (monthc + 1) + "/" + yearc);

        birthDayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog = new DatePickerDialog(AgeCalculatorActivity.this,
                        android.R.style.Theme_Holo_Dialog_MinWidth,
                        birthDateSetListener, yearc, monthc, dayc
                );
                currentDate.setBackgroundResource(R.drawable.button_background3);
                birthDayDate.setBackgroundResource(R.drawable.button_background1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();


            }

        });


        currentDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog dialog = new DatePickerDialog(AgeCalculatorActivity.this,
                        android.R.style.Theme_Holo_Dialog_MinWidth,
                        currentDateSetListener, yearc, monthc, dayc
                );

                birthDayDate.setBackgroundResource(R.drawable.button_background3);
                currentDate.setBackgroundResource(R.drawable.button_background1);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }

        });

        currentDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;


                String date = dayOfMonth + "/" + month + "/" + year;
                currentDate.setText(date);

                cd = dayOfMonth;
                cy = year;
                cm = month;
                setTheAge();


//
            }
        };

        birthDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;
                //bd = bm = by = 0;


                String date = dayOfMonth + "/" + month + "/" + year;
                birthDayDate.setText(date);
                bd = dayOfMonth;
                by = year;
                bm = month;

                setTheAge();


            }
        };


    }

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    void setTheAge() {

        int month[] = {31, 28, 31, 30, 31, 30, 31,
                31, 30, 31, 30, 31};

        int ageInYears, ageInMonths, ageInDays, cm1, cd1, cy1;

        cm1 = cm;
        cd1 = cd;
        cy1 = cy;

        if (bd > cd) {


            cm1 = cm1 - 1;
            cd1 = cd1 + month[bm - 1];
        }

        if (bm > cm) {
            cy1 = cy1 - 1;
            cm1 = cm1 + 12;
        }

        ageInDays = cd1 - bd;
        ageInMonths = cm1 - bm;
        ageInYears = cy1 - by;

        if(bm == cm && bd > cd){
            ageInMonths = 11;
            ageInYears = ageInYears - 1;
        }

        if (ageInYears >= 0) {

            if (ageInMonths >= 0) {
                if (ageInDays >= 0) {
                    showYears.setText(ageInYears + "");
                    showDays.setText(ageInDays + "");
                    showMonths.setText(ageInMonths + "");


                } else {
                    Toast.makeText(AgeCalculatorActivity.this, "Birthday day must be earlier than current day", Toast.LENGTH_SHORT).show();

                }
            } else {

                Toast.makeText(AgeCalculatorActivity.this, "Birthday month must be earlier than current month", Toast.LENGTH_SHORT).show();

            }
        } else {
            Toast.makeText(AgeCalculatorActivity.this, "Birthday date must be earlier than current year", Toast.LENGTH_SHORT).show();
        }
        //setDefaultDate();


    }

    void setDefaultDate() {
        yearc = calendar.get(Calendar.YEAR);
        monthc = calendar.get(Calendar.MONTH);
        dayc = calendar.get(Calendar.DAY_OF_MONTH);
        cm = bm = monthc + 1;
        cd = bd = dayc;
        cy = by = yearc;
    }


}