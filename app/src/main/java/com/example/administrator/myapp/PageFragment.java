package com.example.administrator.myapp;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


// In this case, the fragment displays simple text based on the page
public class PageFragment extends Fragment {
    EditText editId,editName;
    Button btnNhap;
    RadioGroup radgroup;
    ListView lvNhanvien;
    ArrayList<Employee> arrEmployee=new ArrayList<Employee>();
    ArrayAdapter<Employee> adapter=null;

    Employee employee=null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
// starts content of fragment
        editId=(EditText) view.findViewById(R.id.editMa);
        editName=(EditText) view.findViewById(R.id.editTen);
        btnNhap=(Button) view.findViewById(R.id.btnnhap);
        radgroup=(RadioGroup) view.findViewById(R.id.radiogroud1);
        lvNhanvien=(ListView) view.findViewById(R.id.lvnhanvien);


        adapter=new ArrayAdapter<Employee>(getActivity(),
                android.R.layout.simple_list_item_1,
                arrEmployee);

        lvNhanvien.setAdapter(adapter);

        btnNhap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                processNhap();
            }
        });

        return view;
    }

    public void processNhap()
    {

        int radId=radgroup.getCheckedRadioButtonId();
        String id=editId.getText()+"";
        String name=editName.getText()+"";
        if(radId==R.id.radChinhthuc)
        {
            employee=new EmployeeFullTime();
        }
        else
        {
            employee=new EmployeePartTime();
        }

        employee.setId(id);
        employee.setName(name);

        arrEmployee.add(employee);

        adapter.notifyDataSetChanged();
    }
}