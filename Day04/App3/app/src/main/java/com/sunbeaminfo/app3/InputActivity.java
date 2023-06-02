package com.sunbeaminfo.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {
EditText editName,editCourse;
Button btnsave,btncancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        editName = findViewById(R.id.editName);
        editCourse = findViewById(R.id.editCourse);
        btnsave = findViewById(R.id.btnsave);
        btncancel = findViewById(R.id.btncancel);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String course = editCourse.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("name",name);
                intent.putExtra("course",course);
                setResult(0,intent);
                finish();

            }
        });

        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}