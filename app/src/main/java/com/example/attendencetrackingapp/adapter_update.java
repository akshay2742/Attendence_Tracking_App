package com.example.attendencetrackingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class adapter_update extends RecyclerView.Adapter<adapter_update.ViewHolder> {

    private Context mcontext;
    private ArrayList<data_update> mlist;


    int a,b,c;
    adapter_update (Context context, ArrayList<data_update> list)
    {
        mcontext=context;
        mlist=list;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(mcontext);
        View view = layoutInflater.inflate(R.layout.card_update,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        holder.item_name.setText(mlist.get(position).getName());
        holder.item_allowed.setText(mlist.get(position).getTotal_class());
        holder.item_attended.setText(mlist.get(position).getAttended_class());
        holder.b_attend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String prev=holder.ta.getText().toString();
                String prev1=holder.tb.getText().toString();
                holder.ta.setText(String.valueOf(Integer.parseInt(prev)+1));
                holder.tb.setText(String.valueOf(Integer.parseInt(prev1)+1));
            }
        });
        holder.b_leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String prev2=holder.tb.getText().toString();
                holder.tb.setText(String.valueOf(Integer.parseInt(prev2)+1));
            }
        });
    }



    @Override
    public int getItemCount() {

        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView item_name,item_attended,item_allowed;
        Button b_attend,b_leave;
        TextView ta,tb;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_name= itemView.findViewById(R.id.subject_name);
            item_attended= itemView.findViewById(R.id.class_attended);
            item_allowed= itemView.findViewById(R.id.total_classes);
            b_attend=itemView.findViewById(R.id.butt_attend);
            b_leave=itemView.findViewById(R.id.butt_leave);
            ta=itemView.findViewById(R.id.class_attended);
            tb=itemView.findViewById(R.id.total_classes);

        }
    }



}
