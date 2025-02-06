package com.example.ejerciciorecyclerview;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class AnimalViewModel extends ViewModel {
    MutableLiveData<List<Animal>> animales;

    public AnimalViewModel(){
        this.animales = new MutableLiveData<>();
        this.animales.setValue(new ArrayList<>());

        this.addAnimal(new Animal("Águila","Ave rapaz",R.drawable.aguila));
        this.addAnimal(new Animal("Ballena","Mamífero marino",R.drawable.ballena));
        this.addAnimal(new Animal("Caballo","Porte elegante",R.drawable.caballo));
        this.addAnimal(new Animal("Canario","Canto espectacular",R.drawable.canario));
        this.addAnimal(new Animal("Delfín","Mamífero marino",R.drawable.delfin));
        this.addAnimal(new Animal("Gato","Animal doméstico",R.drawable.gato));
    }

    public void addAnimal(Animal animal){
        List<Animal> animalList = animales.getValue();

        if(animal != null){
            animalList.add(animal);
        }
        animales.setValue(animalList);
    }

    public void setAnimalVisitado(Animal animal){
        List<Animal> animalList = animales.getValue();

        if(animal != null){
            animal.setVisitado(true);
        }
        animales.setValue(animalList);
    }
}
