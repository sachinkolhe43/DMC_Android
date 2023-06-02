package com.sunbeaminfo.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("k_name",editName.getText().toString());
            intent.putExtra("k_address",editAddress.getText().toString());
            intent.putExtra("k_age",editAge.getText().toString());
            intent.putExtra("k_mobile",editMobile.getText().toString());
            intent.putExtra("k_email",editEmail.getText().toString());

            editEmail.setText("");
            editName.setText("");
            editMobile.setText("");
            editAddress.setText("");
            editAge.setText("");

            startActivity(intent);
        }
        else if(v.getId() == R.id.btncancel){
           finish();
        }
    }
}