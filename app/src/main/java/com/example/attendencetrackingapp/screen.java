package com.example.attendencetrackingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import android.content.Intent;

import android.widget.Button;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;


public class screen extends AppCompatActivity{
    Button b4;
    Button bsign;
    EditText e_user;
    EditText pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen);
        e_user=findViewById(R.id.username);
        pass=findViewById(R.id.password);

        b4= findViewById(R.id.buttonq);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e_user.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Field is Empty",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (pass.getText().toString().isEmpty())
                    {
                        Toast.makeText(getApplicationContext(),"Field is Empty",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Intent i = new Intent(getApplicationContext(), screen2.class);
                        startActivity(i);
                    }

                }

            }
        });
        bsign=findViewById(R.id.buttons);
        bsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent j= new Intent(getApplicationContext(), signup.class);
                startActivity(j);
            }
        });


    }


}
