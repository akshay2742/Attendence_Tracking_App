package com.example.attendencetrackingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class adapter_show extends RecyclerView.Adapter<adapter_show.ViewHolder> {

    private Context mcontext;
    private ArrayList<show_data> mlist;
    adapter_show (Context context, ArrayList<show_data> list)
    {
        mcontext=context;
        mlist=list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(mcontext);
        View view = layoutInflater.inflate(R.layout.show_card,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.percent.setText(mlist.get(position).getPercent());
        holder.s_name.setText(mlist.get(position).getName());

    }



    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView percent;
        public TextView s_name;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            percent= itemView.findViewById(R.id.percentage);
            s_name= itemView.findViewById(R.id.subject_name);
        }
    }
}
