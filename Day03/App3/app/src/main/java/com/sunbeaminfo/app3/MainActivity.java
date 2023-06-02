package com.sunbeaminfo.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCall(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8983049388"));
        startActivity(intent);
    }

    public void btnBrowse(View view){
    Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://sunbeaminfo.com/placements"));
    startActivity(intent);
    }
}