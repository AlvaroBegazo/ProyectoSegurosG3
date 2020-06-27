package com.segurosx.models;

public  class SeguroVehicular extends Seguro {


    public SeguroVehicular(final String marca, final String modelo)    {

        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "SeguroVehicular [marca=" + marca + ", modelo=" + modelo + "]";
    }

}