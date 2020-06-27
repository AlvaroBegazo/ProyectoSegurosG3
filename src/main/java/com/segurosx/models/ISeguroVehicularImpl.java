package com.segurosx.models;

public class ISeguroVehicularImpl implements ISeguroVehicular{

    @Override
    public String calcularRiesgoVehicular(String marca, String modelo) {
        String nivelRiesgo = "";
        if (marca.equals("Toyota") && modelo.equals("Yaris")) {
            nivelRiesgo = "ALTO";
        }
        else {
            nivelRiesgo = "BAJO";
        } 

        return nivelRiesgo;
    }

    @Override
    public String getDetalleSeguroVehicular(Integer numero, String nivelRiesgo) {
        return "Seg. Vehicular Numero: " + numero + " con riesgo: " + nivelRiesgo;
    }

    @Override
    public String getFechaSeguroVehicular() {
        return "26/6/2020";
    }
  
}