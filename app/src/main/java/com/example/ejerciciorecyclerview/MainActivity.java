package com.example.ejerciciorecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvAnimales;
    AnimalViewModel animalViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnimales = findViewById(R.id.rvAnimales);
        rvAnimales.setLayoutManager(new LinearLayoutManager(this));

        animalViewModel = new ViewModelProvider(this).get(AnimalViewModel.class);
        
        animalViewModel.animales.observe(this,animals -> {
            rvAnimales.setAdapter(new AdapterAnimales(animals));
        });
    }

}