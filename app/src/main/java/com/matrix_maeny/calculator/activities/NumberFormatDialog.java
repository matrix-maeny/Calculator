package com.matrix_maeny.calculator.activities;

import android.app.Dialog;
import android.content.Context;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.appcompat.view.ContextThemeWrapper;

import com.matrix_maeny.calculator.R;

public class NumberFormatDialog extends AppCompatDialogFragment {

    TextView decimalText,binaryText,hexaText,octalText;
    private NumberFormatDialogListner listner;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        ContextThemeWrapper myTeme = new ContextThemeWrapper(getContext(),R.style.Theme_AppCompat_Dialog_MinWidth);
        AlertDialog.Builder builder = new AlertDialog.Builder(myTeme);

        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View root = layoutInflater.inflate(R.layout.numbering_system,null);
        root.setBackground(new ColorDrawable(Color.TRANSPARENT));
        //root.setBackgroundResource(R.drawable.matrix_background);

        builder.setView(root);




        decimalText = root.findViewById(R.id.decimalText);
        binaryText = root.findViewById(R.id.binaryText);
        hexaText = root.findViewById(R.id.hexaText);
        octalText = root.findViewById(R.id.octalText);

        decimalText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String formatText = "Decimal form";
                listner.setTheState(formatText,0);
                dismiss();
            }
        });
        binaryText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String formatText = "Binary form";
                listner.setTheState(formatText,1);
                dismiss();

            }
        });
        hexaText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String formatText = "Hexadecimal form";
                listner.setTheState(formatText,2);
                dismiss();

            }
        });
        octalText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String formatText = "Octal form";
                listner.setTheState(formatText,3);
                dismiss();

            }
        });
        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listner = (NumberFormatDialogListner) context;
        } catch (Exception e) {
            throw new ClassCastException(context.toString()+"must implement NumberFormatDialogListner");
        }

    }

    public interface NumberFormatDialogListner{
        void setTheState(String numForm,int numState);
    }
}
