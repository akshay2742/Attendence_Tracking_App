package com.example.attendencetrackingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;

public class show_attendence extends AppCompatActivity{
    RecyclerView subject_list;
    public ArrayList<show_data> listpass;


    public adapter_show adap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_attendence);



        subject_list = findViewById(R.id.list_subject1);
        listpass = new ArrayList<>();
        listpass.add(new show_data("60","Operating System"));
        listpass.add(new show_data("70","Data Structure"));
        listpass.add(new show_data("50","Android Programming"));
        listpass.add(new show_data("80","Computer Networks"));


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;
        subject_list.setLayoutManager(rvLiLayoutManager);

        adap = new adapter_show(this, listpass);
        subject_list.setAdapter(adap);




    }




}

