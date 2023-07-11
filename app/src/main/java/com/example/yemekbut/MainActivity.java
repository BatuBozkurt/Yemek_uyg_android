package com.example.yemekbut;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.annotation.SuppressLint;
import android.view.Menu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvUrun;
    private RecyclerView.LayoutManager layoutManager;
    private Urun urunAdapter;
    // Diğer değişkenler

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.id.menuGrid);
        setContentView(R.id.menuYatay);
        setContentView(R.id.menuZikZak);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // rvUrun ve diğer bileşenlerin tanımlamaları

        // Diğer işlemler ve ayarlamalar


        Button menuYatay = findViewById(R.id.menuGrid);
        Button menuGrid = findViewById(R.id.menuYatay);
        Button menuZikZak = findViewById(R.id.menuZikZak);

        menuGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
                rvUrun.setLayoutManager(layoutManager);
            }
        });

        menuYatay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
                rvUrun.setLayoutManager(layoutManager);
            }
        });

        menuGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutManager = new GridLayoutManager(MainActivity.this, 2);
                rvUrun.setLayoutManager(layoutManager);
            }
        });

        menuZikZak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
                rvUrun.setLayoutManager(layoutManager);
            }
        });
    }

    // Diğer metotlar ve işlemler
}
