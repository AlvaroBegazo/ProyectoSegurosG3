package com.segurosx.models;

public class SeguroAutoSoat extends SeguroVehicular {

    public SeguroAutoSoat(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public String getDetalleSeguro()    {

        return "Seg. Auto SOAT Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }
    
}