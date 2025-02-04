package com.example.ejerciciorecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvAnimales;
    List<Animal> animales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crearAnimales();


        rvAnimales = findViewById(R.id.rvAnimales);
        rvAnimales.setLayoutManager(new LinearLayoutManager(this));
        rvAnimales.setAdapter(new AdapterAnimales(animales));
    }

    public void crearAnimales(){
        animales = new ArrayList<>();
        animales.add(new Animal("Águila","Ave rapaz",R.drawable.aguila));
        animales.add(new Animal("Ballena","Mamífero marino",R.drawable.ballena));
        animales.add(new Animal("Caballo","Porte elegante",R.drawable.caballo));
        animales.add(new Animal("Canario","Canto espectacular",R.drawable.canario));
        animales.add(new Animal("Delfín","Mamífero marino",R.drawable.delfin));
        animales.add(new Animal("Gato","Animal doméstico",R.drawable.gato));
    }
}