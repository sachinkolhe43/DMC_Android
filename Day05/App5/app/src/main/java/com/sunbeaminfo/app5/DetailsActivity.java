package com.sunbeaminfo.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra("student");
        Log.e("DetailsActivity",student.getName());
        Log.e("DetailsActivity",student.getCourse());
        Log.e("DetailsActivity",student.getSubCourse());
    }
}