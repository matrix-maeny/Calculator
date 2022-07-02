package com.matrix_maeny.calculator.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.matrix_maeny.calculator.R;
import com.matrix_maeny.calculator.activities.AgeCalculatorActivity;
import com.matrix_maeny.calculator.activities.AreaActivity;
import com.matrix_maeny.calculator.activities.DataConverterActivity;
import com.matrix_maeny.calculator.activities.LengthConverterActivity;
import com.matrix_maeny.calculator.activities.MatrixAdjointActivity;
import com.matrix_maeny.calculator.activities.MultiplicationMatrixActivity;
import com.matrix_maeny.calculator.activities.SpeedConverterActivity;
import com.matrix_maeny.calculator.activities.TemperatureConverterActivity;
import com.matrix_maeny.calculator.activities.TimeConverterActivity;
import com.matrix_maeny.calculator.activities.VolumeConverterActivity;
import com.matrix_maeny.calculator.activities.WeightConverterActivity;
import com.matrix_maeny.calculator.models.ActivityModel;

import java.util.ArrayList;

public class ConverterAdapter extends RecyclerView.Adapter<ConverterAdapter.viewHolder> {

    ArrayList<ActivityModel> list;
    Context context;
    String activityName;


    public ConverterAdapter(ArrayList<ActivityModel> list, Context context, String activityName) {
        this.list = list;
        this.context = context;
        this.activityName = activityName;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.converter_layout, parent, false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        ActivityModel model = list.get(position);
        holder.cnvtrName.setText(model.getName());
        holder.cnvtrImage.setImageResource(model.getImage());


        switch (activityName) {
            case "ConverterActivity":
                converterOnclickListner(holder, holder.getAdapterPosition());
                break;
            case "DailyLifeActivity":
                dailyLifeOnclickListner(holder, holder.getAdapterPosition());
                break;
            case "MatrixActivity":
                matrixOnclickListner(holder, holder.getAdapterPosition());
                break;


        }


    }

    void converterOnclickListner(@NonNull viewHolder holder, int position) {
        holder.cnvtrImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intnt;
                switch (position) {
                    case 0:
                        intnt = new Intent(context.getApplicationContext(), AreaActivity.class);
                        context.startActivity(intnt);
                        break;
                    case 1:
                        intnt = new Intent(context.getApplicationContext(), LengthConverterActivity.class);
                        context.startActivity(intnt);
                        break;
                    case 2:
                        intnt = new Intent(context.getApplicationContext(), VolumeConverterActivity.class);
                        context.startActivity(intnt);
                        break;
                    case 3:
                        intnt = new Intent(context.getApplicationContext(), TemperatureConverterActivity.class);
                        context.startActivity(intnt);
                        break;
                    case 4:
                        intnt = new Intent(context.getApplicationContext(), SpeedConverterActivity.class);
                        context.startActivity(intnt);
                        break;
                    case 5:
                        intnt = new Intent(context.getApplicationContext(), TimeConverterActivity.class);
                        context.startActivity(intnt);
                        break;
                    case 6:
                        intnt = new Intent(context.getApplicationContext(), WeightConverterActivity.class);
                        context.startActivity(intnt);
                        break;
                    case 7:
                        intnt = new Intent(context.getApplicationContext(), DataConverterActivity.class);
                        context.startActivity(intnt);
                        break;


                }

            }
        });

    }

    void dailyLifeOnclickListner(@NonNull viewHolder holder, int position) {
        holder.cnvtrImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position) {
                    case 0:
                        Intent intnt = new Intent(context.getApplicationContext(), AgeCalculatorActivity.class);
                        context.startActivity(intnt);
                        break;

                }
            }
        });

    }

//    void financeOnclickListner(@NonNull viewHolder holder, int position) {
//        holder.cnvtrImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (position) {
//                    case 0:
//                        Toast.makeText(context, "Currency", Toast.LENGTH_SHORT).show();
//                        break;
//                    case 1:
//                        Toast.makeText(context, "GST", Toast.LENGTH_SHORT).show();
//                        break;
//
//                }
//            }
//        });
//
//    }

    void matrixOnclickListner(@NonNull viewHolder holder, int position) {
        holder.cnvtrImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intnt;
                switch (position) {
                    case 0:
                         intnt = new Intent(context.getApplicationContext(), MultiplicationMatrixActivity.class);
                        context.startActivity(intnt);
                        break;
                    case 1:
                         intnt = new Intent(context.getApplicationContext(), MatrixAdjointActivity.class);
                        context.startActivity(intnt);
                        break;



                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView cnvtrImage;
        TextView cnvtrName;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            cnvtrImage = itemView.findViewById(R.id.cnvtrImage);
            cnvtrName = itemView.findViewById(R.id.cnvtrName);
        }
    }
}
