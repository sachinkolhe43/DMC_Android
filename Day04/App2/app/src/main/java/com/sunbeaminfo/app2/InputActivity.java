package com.sunbeaminfo.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editName,editAddress,editAge,editMobile,editEmail;
    Button btnsave,btncancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        editName = findViewById(R.id.editName);
        editAddress = findViewById(R.id.editAddress);
        editAge = findViewById(R.id.editAge);
        editMobile = findViewById(R.id.editMobile);
        editEmail = findViewById(R.id.editEmail);
        btnsave = findViewById(R.id.btnsave);
        btncancel = findViewById(R.id.btncancel);

        btnsave.setOnClickListener(this);
        btncancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnsave){
            //choose which ever you like
            /*Person person = new Person(editName.getText().toString(),
                    editAddress.getText().toString(),
                    Integer.parseInt(editAge.getText().toString()),
                    editMobile.getText().toString(),
                    editEmail.getText().toString()); */

            Person person = new Person();
            person.setName(editName.getText().toString());
            person.setAddress(editAddress.getText().toString());
            person.setAge(Integer.parseInt(editAge.getText().toString()));
            person.setMobile(editMobile.getText().toString());
            person.setEmail(editEmail.getText().toString());

            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("person",person);
            startActivity(intent);
        }
        else if(v.getId()==R.id.btncancel){
            finish();
        }
    }
}