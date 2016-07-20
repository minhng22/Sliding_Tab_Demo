package com.example.administrator.myapp;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;


public class CustomLayout extends Fragment {
    Button btn;
    EditText studentID, studentName;
    ArrayList<ClassGender> className=new ArrayList<ClassGender>();
    MyArrayAdapter newadp = null;
    RadioGroup getgender;
    ClassGender newClass = null;
    ListView newListView ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v = inflater.inflate(R.layout.fragment_blank, container, false);
        studentID = (EditText) v.findViewById(R.id.getstudentID);
        studentName = (EditText) v.findViewById(R.id.getstudentName);
        btn = (Button) v.findViewById(R.id.SubmitButton);
        className =new ArrayList<ClassGender>();

        newListView = (ListView) v.findViewById(R.id.listView);

        getgender = (RadioGroup) v.findViewById(R.id.Gender);
        newadp = new MyArrayAdapter(getActivity(), R.layout.my_item_layout, className);
        newListView.setAdapter(newadp);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processButton();
            }

            private void processButton() {

                String id = studentID.getText() + "";
                String name = studentName.getText() + "";
                boolean gender = false;
                if (getgender.getCheckedRadioButtonId() == R.id.male)
                {gender = true;}

                newClass = new ClassGender();

                newClass.setID(id);
                newClass.setGender(gender);
                newClass.setStudentName(name);


                className.add(newClass);
                newadp.notifyDataSetChanged();

                studentID.setText("");
                studentName.setText("");
                studentID.requestFocus();
            }
        });

        return v;
    }

}
