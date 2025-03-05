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

        animalViewModel = AnimalViewModel.getInstance(this.getApplication());
        
        animalViewModel.animales.observe(this,animals -> {
            rvAnimales.setAdapter(new AdapterAnimales(animals));
        });

        crearAnimales();
    }

    private void crearAnimales() {
        animalViewModel.animales.setValue(new ArrayList<>());
        animalViewModel.addAnimal(new Animal("Águila","Ave rapaz",R.drawable.aguila));
        animalViewModel.addAnimal(new Animal("Ballena","Mamífero marino",R.drawable.ballena));
        animalViewModel.addAnimal(new Animal("Caballo","Porte elegante",R.drawable.caballo));
        animalViewModel.addAnimal(new Animal("Canario","Canto espectacular",R.drawable.canario));
        animalViewModel.addAnimal(new Animal("Delfín","Mamífero marino",R.drawable.delfin));
        animalViewModel.addAnimal(new Animal("Gato","Animal doméstico",R.drawable.gato));
    }

}