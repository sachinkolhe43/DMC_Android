package com.sunbeaminfo.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {
    EditText editName, editMobile;
    Spinner spinnerCourse, spinnerSubCourse;
    String[] course = new String[]{"PG", "Precat", "Modular"};
    Student student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        editName = findViewById(R.id.editName);
        editMobile = findViewById(R.id.editMobile);
        spinnerCourse = findViewById(R.id.spinnerCourse);
        spinnerSubCourse = findViewById(R.id.spinnerSubCourse);
        student = new Student();
        ArrayAdapter arrayAdapterCourse = new ArrayAdapter(this, android.R.layout.simple_list_item_1, course);
        spinnerCourse.setAdapter(arrayAdapterCourse);
        spinnerCourse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                student.setCourse(course[position]);
                switch (position){
                    case 0:
                        setSpinnerSubCourse(new String[]{"DAC","DMC","DESD","DBDA","DITISS"});
                        break;
                    case 1:
                        setSpinnerSubCourse(new String[]{"OM","PH","PM"});
                        break;
                    case 2:
                        setSpinnerSubCourse(new String[]{"CPP","JAVA","ML","Python"});
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void save(View view) {
        student.setName(editName.getText().toString());
        student.setMobile(editMobile.getText().toString());
        Intent intent = new Intent();
        intent.putExtra("student",student);
        setResult(0,intent);
        finish();
    }

    public void setSpinnerSubCourse(String [] subCourse){
    ArrayAdapter arrayAdapterSubCourse = new ArrayAdapter(this, android.R.layout.simple_list_item_1,subCourse);
    spinnerSubCourse.setAdapter(arrayAdapterSubCourse);
    spinnerSubCourse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            student.setSubCourse(subCourse[position]);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });
    }
}