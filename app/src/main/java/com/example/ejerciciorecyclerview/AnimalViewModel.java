package com.example.ejerciciorecyclerview;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class AnimalViewModel extends AndroidViewModel {
    MutableLiveData<List<Animal>> animales;
    private static AnimalViewModel instance;


    private AnimalViewModel(Application application){
        super(application);
        this.animales = new MutableLiveData<>();
    }

    public static synchronized AnimalViewModel getInstance(Application application){
        if(instance == null){
            instance = new AnimalViewModel(application);
        }
        return instance;
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
