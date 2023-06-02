package com.sunbeaminfo.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
TextView  textName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textName = findViewById(R.id.textName);
        Intent intent = getIntent();
        String name =  intent.getStringExtra("k_name");
        textName.setText(name);
        //Toast.makeText(this, "on second activity = "+name, Toast.LENGTH_SHORT).show();
    }


}