package com.sunbeaminfo.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView textName,textGender,textCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        textName = findViewById(R.id.textName);
        textGender = findViewById(R.id.textGender);
        textCourse = findViewById(R.id.textCourse);

        Intent intent = getIntent();
        String name = intent.getStringExtra("k_name");
        textName.setText(name);
        String gender = intent.getStringExtra("k_gender");
        textGender.setText(gender);
        textCourse.setText(intent.getStringExtra("k_course"));
    }
}