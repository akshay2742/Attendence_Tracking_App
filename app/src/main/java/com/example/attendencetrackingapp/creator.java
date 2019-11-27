package com.example.attendencetrackingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class creator extends AppCompatActivity {
    ImageView fb;
    ImageView li;
    ImageView gb;
    TextView p,m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creator);

        fb=findViewById(R.id.facebook);
        li=findViewById(R.id.linkedin);
        gb=findViewById(R.id.github);
        p=findViewById(R.id.phn);
        m=findViewById(R.id.mail);


        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/coderakshay"));
                startActivity(i);

            }
        });

        li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/akshay-sharma-35249b170/"));
                startActivity(i);

            }
        });

        gb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/akshay2742"));
                startActivity(i);

            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Intent.ACTION_DIAL,Uri.parse("tel:" + "+91 9639064985"));
                startActivity(i);
            }
        });

    }
}
