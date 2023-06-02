package com.sunbeaminfo.app3;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textName,textCourse;
    Button btngetData,btnclear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngetData = findViewById(R.id.btngetData);
        btnclear = findViewById(R.id.btnclear);
        textName = findViewById(R.id.textName);
        textCourse = findViewById(R.id.textCourse);
        btngetData.setOnClickListener(this);
        btnclear.setOnClickListener(this);
    }

    ActivityResultLauncher activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if(result.getData() != null) {
                Intent intent = result.getData();
                textName.setText("Name : " + intent.getStringExtra("name"));
                textCourse.setText("Course : " + intent.getStringExtra("course"));
            }
        }
    });

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btngetData){
            Intent intent = new Intent(this, InputActivity.class);
            activityResultLauncher.launch(intent);
        }
        else if(v.getId() ==  R.id.btnclear){
            textName.setText("Name :");
            textCourse.setText("Course :");
        }
    }
}