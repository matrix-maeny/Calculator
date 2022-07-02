package com.matrix_maeny.calculator.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.matrix_maeny.calculator.R;


public class TemperatureConverterFragment extends BottomSheetDialogFragment {


    TextView textView1,textView2,frText1, frText2, frText3, frText4, frText5, frText6, frText7, frText8, frText9, frText10, frText11, frText12, frText13, frText14, frText15, frText16, frText17, frText18, frText19, frText20;
    BottomFragmentListner listner;

    int flag;


    public TemperatureConverterFragment(TextView textView1, TextView textView2, int flag) {
        this.textView1 = textView1;
        this.textView2 = textView2;

        this.flag = flag;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom_units, container, false);

        frText1 = view.findViewById(R.id.frText1);
        frText2 = view.findViewById(R.id.frText2);
        frText3 = view.findViewById(R.id.frText3);
        frText4 = view.findViewById(R.id.frText4);
        frText5 = view.findViewById(R.id.frText5);
        frText6 = view.findViewById(R.id.frText6);
        frText7 = view.findViewById(R.id.frText7);
        frText8 = view.findViewById(R.id.frText8);
        frText9 = view.findViewById(R.id.frText9);
        frText10 = view.findViewById(R.id.frText10);
        frText11 = view.findViewById(R.id.frText11);
        frText12 = view.findViewById(R.id.frText12);
        frText13 = view.findViewById(R.id.frText13);
        frText14 = view.findViewById(R.id.frText14);
        frText15 = view.findViewById(R.id.frText15);
        frText16 = view.findViewById(R.id.frText16);
        frText17 = view.findViewById(R.id.frText17);
        frText18 = view.findViewById(R.id.frText18);
        frText19 = view.findViewById(R.id.frText19);
        frText20 = view.findViewById(R.id.frText20);

        // setting text
        frText1.setText("Celsius °C");
        frText2.setText("Fahrenheit °F");
        frText3.setText("Kelvin °K");
        frText4.setVisibility(View.GONE);
        frText5.setVisibility(View.GONE);
        frText6.setVisibility(View.GONE);
        frText7.setVisibility(View.GONE);
        frText8.setVisibility(View.GONE);
        frText9.setVisibility(View.GONE);
        frText10.setVisibility(View.GONE);
        frText11.setVisibility(View.GONE);
        frText12.setVisibility(View.GONE);
        frText13.setVisibility(View.GONE);
        frText14.setVisibility(View.GONE);
        frText15.setVisibility(View.GONE);
        frText16.setVisibility(View.GONE);
        frText17.setVisibility(View.GONE);
        frText18.setVisibility(View.GONE);
        frText19.setVisibility(View.GONE);
        frText20.setVisibility(View.GONE);


        //setting click listeners

        frText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempText = "°C";
                listner.setButtonTexts(tempText, flag);
                dismiss();
            }
        });//kms
        frText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempText = "°F";
                listner.setButtonTexts(tempText, flag);
                dismiss();
            }
        });//ha
        frText3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempText = "°K";
                listner.setButtonTexts(tempText, flag);
                dismiss();
            }
        });//a
//        frText4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "m²";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        }); // m2
//        frText5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "dm²";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        }); // dm2
//        frText6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "cm²";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        });//cm2
//        frText7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "mm²";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        });//mm2
//        frText8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "µm²";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        });//um2
//        frText9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "ac";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        });//ac
//        frText10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "mile²";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        });//mile2
//        frText11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "yd²";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        });//yd2
//        frText12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "ft²";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        });//ft2
//        frText13.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "in²";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        });//in2
//        frText14.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "rd²";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        });//rd2
//        frText15.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "qing";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        });//qing
//        frText16.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "chi²";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        });//chi2
//        frText17.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "cun²";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        });//cun2
//        frText18.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "gongli²";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        });//gongli
//        frText19.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String tempText = "mu";
//                listner.setButtonTexts(tempText, flag);
//                dismiss();
//            }
//        });//mu

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listner = (BottomFragmentListner) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "Must implement BottomFragmentListner");
        }
    }

    public interface BottomFragmentListner {
        void setButtonTexts(String texts, int flag);
    }
}