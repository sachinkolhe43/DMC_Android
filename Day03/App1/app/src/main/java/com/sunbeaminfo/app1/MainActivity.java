package com.sunbeaminfo.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
CheckBox checkboxCPP,checkboxJAVA;
Button btnShowImage;
ImageView imageCPP,imageJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkboxCPP = findViewById(R.id.checkboxCPP);
        checkboxJAVA = findViewById(R.id.checkboxJAVA);
        btnShowImage = findViewById(R.id.btnShowImage);
        imageCPP = findViewById(R.id.imageCPP);
        imageJAVA = findViewById(R.id.imageJAVA);
img1
        btnShowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkboxCPP.isChecked())
                    imageCPP.setImageResource(R.drawable.cpp);
                else
                    imageCPP.setImageResource(R.drawable.ic_launcher_background);

                if(checkboxJAVA.isChecked())
                    imageJAVA.setImageResource(R.drawable.java);
                else
                    imageJAVA.setImageResource(R.drawable.ic_launcher_background);
            }
        });
    }
}