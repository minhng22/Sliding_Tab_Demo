package com.example.administrator.myapp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class AndroidLifetime extends Fragment implements View.OnClickListener{
    Button btn1, btn2;

    public AndroidLifetime(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_fragment1, container, false);

        btn1=(Button) myView.findViewById(R.id.button1);
        btn1.setOnClickListener(this);

        btn2=(Button) myView.findViewById(R.id.button2);
        btn2.setOnClickListener(this);

        return myView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Intent intent=new Intent(getActivity().getApplication(), SubActivity1.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2=new Intent(getActivity().getApplication(), SubActivity2.class);
                startActivity(intent2);
            default:
                break;
        }
    }
}