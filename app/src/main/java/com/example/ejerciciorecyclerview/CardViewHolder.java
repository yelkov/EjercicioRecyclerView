package com.example.ejerciciorecyclerview;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewHolder extends RecyclerView.ViewHolder {

    TextView txtAnimal, txtDescripcion;
    Button btnAnimal;
    ImageView imgAnimal;

    public CardViewHolder(@NonNull View itemView) {
        super(itemView);
        txtAnimal = itemView.findViewById(R.id.txtAnimal);
        txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
        imgAnimal = itemView.findViewById(R.id.imgAnimal);
        btnAnimal = itemView.findViewById(R.id.btnAnimal);
    }
}
