package com.example.navigationview08102019;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.navigation);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setBackgroundColor(Color.parseColor("#AbcdfF"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        navigationView.setItemIconTintList(null);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_item_call:
                        Toast.makeText(MainActivity.this, "Ban chon vao call", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_item_gallery:
                        Toast.makeText(MainActivity.this, "Ban chon vao gallery", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_item_import:
                        Toast.makeText(MainActivity.this, "Ban chon vao import", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_item_Report:
                        Toast.makeText(MainActivity.this, "Ban chon vao report", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_item_send:
                        Toast.makeText(MainActivity.this, "Ban chon vao send", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_item_slideshow:
                        Toast.makeText(MainActivity.this, "Ban chon vao slideshow", Toast.LENGTH_SHORT).show();
                        break;
                }
                drawerLayout.closeDrawer(Gravity.LEFT);
                return true;
            }
        });
    }
}
