package com.sunbeaminfo.app7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String tag = "MainActivity";
   CheckBox checkBoxJava,checkBoxJS,checkBoxC,checkBoxCPP,checkBoxSQL;
   Button btnsave;

   RadioButton radioMale,radioFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxJava = findViewById(R.id.checkBoxJava);
        checkBoxJS = findViewById(R.id.checkBoxJS);
        checkBoxC = findViewById(R.id.checkBoxC);
        checkBoxCPP = findViewById(R.id.checkBoxCPP);
        checkBoxSQL = findViewById(R.id.checkBoxSQL);
        btnsave = findViewById(R.id.btnsave);
        radioMale = findViewById(R.id.radioMale);
        radioFemale = findViewById(R.id.radioFemale);
        btnsave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String languages = "Fav Languages - ";
           if(checkBoxC.isChecked())
               languages = languages+",C";
               //Log.e(tag,"C is Your Fav Language");
           if(checkBoxCPP.isChecked())
               languages = languages+",CPP";
           // Log.e(tag,"CPP is Your Fav Language");
            if(checkBoxJava.isChecked())
                languages = languages+",JAVA";
                //Log.e(tag,"Java is Your Fav Language");
        if(checkBoxJS.isChecked())
            languages = languages+",JS";
        //Log.e(tag,"JS is Your Fav Language");
        if(checkBoxSQL.isChecked())
            languages = languages+",SQL";
        //Log.e(tag,"SQL is Your Fav Language");
        Log.e(tag,languages);

        String gender="";MainActivity.this
        if(radioMale.isChecked())
            gender = "Male";
        if(radioFemale.isChecked())
            gender = "Female";

        Toast.makeText(this,gender + " Have selected "+ languages, Toast.LENGTH_SHORT).show();
    }
}