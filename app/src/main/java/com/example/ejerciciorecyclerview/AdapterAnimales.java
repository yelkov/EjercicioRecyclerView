package com.example.ejerciciorecyclerview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterAnimales extends RecyclerView.Adapter {

    public static final String POSICION_ANIMAL = "posicionAnimal";
    List<Animal> animales;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_tarjeta_animal,parent,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        CardViewHolder viewHolder = (CardViewHolder) holder;
        Animal animal = animales.get(position);
        viewHolder.txtAnimal.setText(animal.getNombre());
        viewHolder.txtDescripcion.setText(animal.getDescripcion());
        viewHolder.imgAnimal.setImageResource(animal.getImagen());
        if(animal.isVisitado()){
            viewHolder.imgVisitado.setImageResource(R.drawable.color_rosa);
        }else{
            viewHolder.imgVisitado.setImageResource(R.drawable.color_verde);
        }
        viewHolder.btnAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),DetallesActivity.class);
                intent.putExtra(POSICION_ANIMAL, position);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return animales.size();
    }

    public AdapterAnimales(List<Animal> animales){
        this.animales = animales;
    }
}
