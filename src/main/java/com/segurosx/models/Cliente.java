package com.segurosx.models;

public class Cliente {
    
    private String nombre;
    private SeguroVehicular seguroVehicular;

    public Cliente(String nombre)   {

        this.nombre = nombre;
    }

    public void setCompraSeguroVehicular(SeguroVehicular seguroVehicular) {

        this.seguroVehicular = seguroVehicular;
    }

    public void getListaSeguroCliente()    {

        System.out.println("Nombre: " + this.nombre + " - Seguro: " + this.seguroVehicular.getDetalleSeguro());
    }
}