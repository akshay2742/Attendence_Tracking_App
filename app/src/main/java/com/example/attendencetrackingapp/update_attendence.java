package com.example.attendencetrackingapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.util.ArrayList;

public class update_attendence extends AppCompatActivity implements update_popup.popupListener{
    RecyclerView subject_list;
    public ArrayList<data_update> listpass;
    TextView button_add;
    public String sname, totalAttend, attend;
    public adapter_update adap;
    TextView ti,tb,tc;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_attendence);



        subject_list = findViewById(R.id.list_subject);
        ti=findViewById(R.id.subject_name);
        tb=findViewById(R.id.class_attended);
        tc=findViewById(R.id.total_classes);


        listpass = new ArrayList<>();
        listpass.add(new data_update("Operating System", "10", "20"));
        listpass.add(new data_update("Data Structure", "5", "10"));
        listpass.add(new data_update("Android Programming", "7", "18"));
        listpass.add(new data_update("Computer Networks", "8", "18"));




        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;
        subject_list.setLayoutManager(rvLiLayoutManager);

        adap = new adapter_update(this, listpass);
        subject_list.setAdapter(adap);

        button_add = findViewById(R.id.add);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });



    }
    public void openDialog(){
        update_popup pop=new update_popup();
        pop.show(getSupportFragmentManager(),"Popup");
    }


    @Override
    public void applyTexts(String s_name, String a_class, String t_class) {
//        ti.setText(s_name);
//        tb.setText(a_class);
//        tc.setText(t_class);
    }
}

