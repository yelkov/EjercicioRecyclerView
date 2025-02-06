package com.example.ejerciciorecyclerview;

import java.io.Serializable;

public class Animal implements Serializable {

    private String nombre;
    private String descripcion;
    private Integer imagen;
    private Boolean visitado;

    public Animal(String nombre,String descripcion, Integer imagen){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.visitado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    public Boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(Boolean visitado) {
        this.visitado = visitado;
    }
}
