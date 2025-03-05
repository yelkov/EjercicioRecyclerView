package com.example.ejerciciorecyclerview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

public class DetallesActivity extends AppCompatActivity {
    ImageView imgAnimalDetalles;
    TextView txtAnimalDetalles, txtDescripcionDetalles;
    Button btnVolver;
    AnimalViewModel animalViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        imgAnimalDetalles = findViewById(R.id.imgAnimalDetalle);
        txtAnimalDetalles = findViewById(R.id.txtAnimalDetalles);
        txtDescripcionDetalles = findViewById(R.id.txtDescripcionDetalles);
        btnVolver = findViewById(R.id.btnVolver);
        animalViewModel = AnimalViewModel.getInstance(this.getApplication());
        Integer posicion = getIntent().getIntExtra(AdapterAnimales.POSICION_ANIMAL,0);
        Animal animal = animalViewModel.animales.getValue().get(posicion);
        if(animal != null){
            imgAnimalDetalles.setImageResource(animal.getImagen());
            txtAnimalDetalles.setText(animal.getNombre());
            txtDescripcionDetalles.setText(animal.getDescripcion());
            animalViewModel.setAnimalVisitado(animal);
        }



        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}