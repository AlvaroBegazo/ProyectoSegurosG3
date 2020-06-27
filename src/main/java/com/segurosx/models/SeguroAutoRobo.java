package com.segurosx.models;

public class SeguroAutoRobo extends SeguroVehicular {

    public SeguroAutoRobo(String marca, String modelo) {
        super(marca, modelo);
    }

    
    @Override
    public String getDetalleSeguro()    {

        return "Seg. Auto Robo Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }
    
}