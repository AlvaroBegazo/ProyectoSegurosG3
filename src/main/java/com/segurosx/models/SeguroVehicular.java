package com.segurosx.models;

import com.segurosx.interfaces.ISeguroVehicular;

public class SeguroVehicular extends Seguro implements ISeguroVehicular {

    protected String marca;

    protected String modelo;
    
    public SeguroVehicular(final String marca, final String modelo)    {

        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void cacularRiesgo()   {

        if (this.marca.equals("Toyota") && this.modelo.equals("Yaris")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 
    }

    @Override
    public String getDetalleSeguro()    {

        return "Seg. Vehicular Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }

    @Override
    public String getFechaSeguroVehicular() {
        return "26/6/2020";
    }

}