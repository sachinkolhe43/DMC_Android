package com.sunbeaminfo.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
private static final String tag = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(tag,"onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(tag,"onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(tag,"onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(tag,"onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(tag,"onStop()");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(tag,"onDestroy()");
    }

    public  void next(View view){
        Intent intent =  new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();

    }
}