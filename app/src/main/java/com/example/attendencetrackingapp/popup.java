package com.example.attendencetrackingapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.example.attendencetrackingapp.subject;


public class popup extends AppCompatDialogFragment {

    private EditText entername;
    private EditText enterattend;
    private EditText entertattend;
    private popupListener listener;


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());

        LayoutInflater inflater= getActivity().getLayoutInflater();
        View view= inflater.inflate(R.layout.popup,null);

        builder.setView(view);
        builder.setTitle("Enter Details");
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                String s_name = entername.getText().toString();
                String a_class = enterattend.getText().toString();
                String t_class = entertattend.getText().toString();
                subject s1=new subject();
                s1.applyTexts(s_name,a_class,t_class);

                listener.applyTexts(s_name, a_class, t_class);


            }
        });


        entername=view.findViewById(R.id.namesubject);
        enterattend=view.findViewById(R.id.attended);
        entertattend=view.findViewById(R.id.tattended);




        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listener=(popupListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "must implement popupListener");
        }
    }

    public interface popupListener{
        void applyTexts(String s_name, String a_class, String t_class);
    }
}
