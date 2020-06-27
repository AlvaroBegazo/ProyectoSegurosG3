package com.segurosx.models;

public interface ISeguroTarjeta {

    public String calcularRiesgoTarjeta(String bancoTarjeta);

    public String getDetalleSeguroTarjeta(Integer numero, String nivelRiesgo);

    public String getFechaTarjeta();
    
}