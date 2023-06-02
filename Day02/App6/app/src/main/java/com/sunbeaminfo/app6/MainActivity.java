package com.sunbeaminfo.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textName,textCourse;
EditText editName, editCourse;
Button btnsave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textName = findViewById(R.id.textName);
        textCourse = findViewById(R.id.textCourse);
        editName = findViewById(R.id.editName);
        editCourse = findViewById(R.id.editCourse);

        btnsave = findViewById(R.id.btnsave);

        /*btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String course = editCourse.getText().toString();

                textName.setText(name);
                textCourse.setText(course);
            }
        });*/
    }

    public void save(View v){
        String name = editName.getText().toString();
        String course = editCourse.getText().toString();
        textName.setText("Name : "+name);
        textCourse.setText("Course : "+course);
    }

    public void cancel(View v){
        textName.setText("Name : ");
        textCourse.setText("Course : ");
    }
}