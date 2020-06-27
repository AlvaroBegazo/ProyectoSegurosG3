package com.segurosx.models;

public class ISeguroTarjetaImpl implements ISeguroTarjeta {

    @Override
    public String calcularRiesgoTarjeta(String bancoTarjeta) {
        String nivelRiesgo = "";
        if (bancoTarjeta.equals("AZTECA")) {
            nivelRiesgo = "ALTO";
        }
        else {
            nivelRiesgo = "BAJO";
        } 

        return nivelRiesgo;
    }

    @Override
    public String getDetalleSeguroTarjeta(Integer numero, String nivelRiesgo) {
        return "Seg. Tarjeta Numero: " + numero + " con riesgo: " + nivelRiesgo;
    }

    @Override
    public String getFechaTarjeta() {
        return "26/6/2020";
    }
    
}