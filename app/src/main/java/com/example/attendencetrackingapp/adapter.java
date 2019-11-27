package com.example.attendencetrackingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {

    private Context mcontext;
    private ArrayList<Data> mlist;
    adapter (Context context, ArrayList<Data> list)
    {
        mcontext=context;
        mlist=list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(mcontext);
        View view = layoutInflater.inflate(R.layout.card_subject,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.item_name.setText(mlist.get(position).getName());
        holder.item_allowed.setText(mlist.get(position).getTotal_class());
        holder.item_attended.setText(mlist.get(position).getAttended_class());
    }

    @Override
    public int getItemCount() {

        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
public TextView item_name,item_attended,item_allowed;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_name= itemView.findViewById(R.id.subject_name);
            item_attended= itemView.findViewById(R.id.class_attended);
            item_allowed= itemView.findViewById(R.id.total_classes);
        }
    }

}
