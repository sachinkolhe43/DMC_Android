package com.sunbeaminfo.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
String courses[] = new String[]{"DAC","DMC","DBDA","DESD","DITISS"};
    EditText editName;
    RadioButton radioMale, radioFeMale;
    Spinner spinnerCourse;
    String course = "";
    String name = "";
    String gender = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.editName);
        radioMale = findViewById(R.id.radioMale);
        radioFeMale = findViewById(R.id.radioFeMale);
        spinnerCourse = findViewById(R.id.spinnerCourse);

        //to attach the list of courses to spinner
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,courses);
        spinnerCourse.setAdapter(arrayAdapter);


        spinnerCourse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               //getting the selected course
                course = courses[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void save(View view){
        //fetching the enterd name
        name = editName.getText().toString();

        //checking which gender is selected
        if(radioMale.isChecked())
            gender = "Male";
        else if(radioFeMale.isChecked())
            gender = "female";

        //navigating to the DetailsActivity
        Intent intent = new Intent(this,DetailsActivity.class);
        intent.putExtra("k_name",name);
        intent.putExtra("k_gender",gender);
        intent.putExtra("k_course",course);
        startActivity(intent);
    }
}