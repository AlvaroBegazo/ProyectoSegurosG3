package com.segurosx.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String id;
    private String nombre;
    private String apellido;
    private List<Seguro> seguros;

    public Cliente(String nombre)   {

        this.nombre = nombre;
        this.seguros = new ArrayList<Seguro>();
    }

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

    public List<Seguro> getSeguros() {
        return seguros;
    }

    public void setSeguros(List<Seguro> seguros) {
        this.seguros = seguros;
    }

    public void setCompraSeguro(Seguro seguro) {

        this.seguros.add( seguro );
    }

    public void getListaSeguroCliente()    {

        System.out.println("Nombre: " + this.nombre );
        for (Seguro seguro : seguros )  {

            System.out.println( "Seguro: " + seguro.getDetalleSeguro());
        }
        
    }

}