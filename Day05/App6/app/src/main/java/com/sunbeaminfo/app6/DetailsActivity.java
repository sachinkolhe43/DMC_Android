package com.sunbeaminfo.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView textName,textMobile,textCourse,textSubCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        textName = findViewById(R.id.textName);
        textMobile = findViewById(R.id.textMobile);
        textCourse = findViewById(R.id.textCourse);
        textSubCourse = findViewById(R.id.textSubCourse);

        Student student = (Student) getIntent().getSerializableExtra("student");
        textName.setText("Name : "+student.getName());
        textMobile.setText("Mobile : "+student.getMobile());
        textCourse.setText("Course : "+student.getCourse());
        textSubCourse.setText("SubCourse : "+student.getSubCourse());
    }
}