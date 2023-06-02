package com.sunbeaminfo.app6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //To add the back action to your toolbar
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Profile");
        menu.add("Settings");
        menu.add("Logout");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getTitle().equals("Profile")) {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
            //Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle().equals("Settings")) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            //Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();

        } else if (item.getTitle().equals("Logout")) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void popup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        Menu menu = popupMenu.getMenu();
        menu.add("Archive");
        menu.add("Delete");
        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getTitle().equals("Archive"))
                    Toast.makeText(MainActivity.this, "Archive is clicked", Toast.LENGTH_SHORT).show();
                else if (item.getTitle().equals("Delete"))
                    Toast.makeText(MainActivity.this, "Delete is clicked", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }


}