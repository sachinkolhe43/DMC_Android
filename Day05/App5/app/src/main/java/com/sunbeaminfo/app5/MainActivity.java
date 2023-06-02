package com.sunbeaminfo.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
EditText editName, editCourse, editSubCourse;
ListView listView;
ArrayAdapter arrayAdapter;
List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.editName);
        editCourse = findViewById(R.id.editCourse);
        editSubCourse = findViewById(R.id.editSubCourse);
        listView = findViewById(R.id.listView);
        studentList = new ArrayList<>();
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,studentList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, studentList.get(position).toString(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("student",studentList.get(position));
                startActivity(intent);
            }
        });
    }

    public void save(View view){
        Student student = new Student(editName.getText().toString(),
                editCourse.getText().toString(),
                editSubCourse.getText().toString());

        studentList.add(student);
        editName.setText("");
        editCourse.setText("");
        editSubCourse.setText("");
        arrayAdapter.notifyDataSetChanged();
    }
}