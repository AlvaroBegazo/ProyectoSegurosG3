package com.segurosx.models;

public class SeguroAutoTodoRiesgo extends SeguroVehicular {

    public SeguroAutoTodoRiesgo(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public String getDetalleSeguro()    {

        return "Seg. Auto Todo Riesgo Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }
    
}