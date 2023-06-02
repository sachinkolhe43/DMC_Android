package com.sunbeaminfo.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
TextView textName,textCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        textName = findViewById(R.id.textName);
        textCourse = findViewById(R.id.textCourse);

        Intent intent = getIntent();
        textName.setText("Name : "+intent.getStringExtra("name"));
        textCourse.setText("Course : "+intent.getStringExtra("course"));

    }
}