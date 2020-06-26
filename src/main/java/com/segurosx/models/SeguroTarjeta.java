package com.segurosx.models;

// public class SeguroTarjeta extends Seguro implements ISeguro {
public class SeguroTarjeta extends Seguro {
  
    protected String bancoTarjeta;  // el nombre del banco de la tarjeta

    public SeguroTarjeta(String bancoTarjeta)    {

        super();
        this.bancoTarjeta = bancoTarjeta;
    }

    @Override
    public void cacularRiesgo()   {

        if (this.bancoTarjeta.equals("AZTECA")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 
    }

    @Override
    public String getDetalleSeguro() {
        return "Seg. Tarjeta,  Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }
    
}