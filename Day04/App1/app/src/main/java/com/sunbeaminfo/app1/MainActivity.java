package com.sunbeaminfo.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private static final String tag = "MainActivity";

TextView  textName,textEmail,textMobile;
Button btnback;
   
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textName = findViewById(R.id.textName);
        textEmail = findViewById(R.id.textEmail);
        textMobile = findViewById(R.id.textMobile);
        btnback = findViewById(R.id.btnback);

        Intent intent = getIntent();
        textName.setText("Name : "+intent.getStringExtra("k_name"));
        textMobile.setText("Mobile :"+intent.getStringExtra("k_mobile"));
        textEmail.setText("Email : "+intent.getStringExtra("k_email"));
        Log.e(tag,intent.getStringExtra("k_address"));
        Log.e(tag,intent.getStringExtra("k_age"));


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}