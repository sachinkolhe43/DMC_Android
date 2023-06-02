package com.sunbeaminfo.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText editCar;
    ListView listView;
    ArrayAdapter arrayAdapter;
    List<String> carsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editCar = findViewById(R.id.editCar);
        listView = findViewById(R.id.listView);
        carsList = new ArrayList<>();
        carsList.add("Maruti");

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,carsList);
        listView.setAdapter(arrayAdapter);
    }

    public void add(View view){
        String car = editCar.getText().toString();
        carsList.add(car);
        editCar.setText("");
        arrayAdapter.notifyDataSetChanged();
    }
}