package com.example.attendencetrackingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.os.Bundle;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    Button b;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    EditText email,user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        b=findViewById(R.id.buttonreg);
        email=findViewById(R.id.mail);
        user=findViewById(R.id.user);
        pass=findViewById(R.id.passw);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter the Email Address",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (email.getText().toString().trim().matches(emailPattern))
                    {
                        if (user.getText().toString().isEmpty())
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
                                Intent i= new Intent(getApplicationContext(),screen2.class);
                                startActivity(i);
                            }
                        }

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Invalid Email Address",Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });
        Toast.makeText(getApplicationContext(),"Enter Your Details",Toast.LENGTH_SHORT).show();
    }
}
