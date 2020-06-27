package com.segurosx.models;

import java.util.List;

public class Cliente {
    private String id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String direccion;
    private List<Seguro> seguro;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

     public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Seguro> getSeguro() {
        return seguro;
    }

    public void setSeguro(List<Seguro> seguro) {
        this.seguro = seguro;
    }

    

}