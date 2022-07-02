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
import com.matrix_maeny.calculator.activities.CalculatorActivity;
import com.matrix_maeny.calculator.activities.ConverterActivity;
import com.matrix_maeny.calculator.activities.DailyActivity;
import com.matrix_maeny.calculator.activities.MatrixActivity;
import com.matrix_maeny.calculator.models.ActivityModel;

import java.util.ArrayList;

public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.viewHolder> {

    ArrayList<ActivityModel> list;
    Context context;


    public ActivityAdapter(ArrayList<ActivityModel> list, Context context) {
        this.list = list;
        this.context = context;

    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.main_layout,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        ActivityModel model = list.get(position);
        holder.activityName.setText(model.getName());
        holder.activityImage.setImageResource(model.getImage());

        holder.activityImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intnt;
                switch (holder.getAdapterPosition()){
                    case 0:
                        intnt = new Intent(v.getContext(), CalculatorActivity.class);
                        context.startActivity(intnt);
                        break;
                    case 1:
                        intnt = new Intent(v.getContext(), ConverterActivity.class);
                        context.startActivity(intnt);
                        break;
                    case 2:
                        intnt = new Intent(v.getContext(), DailyActivity.class);
                        context.startActivity(intnt);
                        break;

                    case 3:
                        intnt = new Intent(v.getContext(), MatrixActivity.class);
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

        ImageView activityImage;
        TextView activityName;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            activityImage = itemView.findViewById(R.id.activityImage);
            activityName = itemView.findViewById(R.id.activityName);
        }
    }
}
