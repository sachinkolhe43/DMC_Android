package com.sunbeaminfo.app4;

import androidx.appcompat.app.AppCompatActivity;
 <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Name : " 
        android:id="@+id/editName"
        android:textSize="30dp"/>
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textName,textCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName =  findViewById(R.id.textName);
        textCourse = findViewById(R.id.textCourse);

        textName.setText("Rajiv");
        textCourse.setText("DMC");
    }
}