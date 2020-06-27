package com.segurosx.models;

public interface ISeguroVehicular {

    public String calcularRiesgoVehicular(String marca, String modelo);

    public String getDetalleSeguroVehicular(Integer numero, String nivelRiesgo);

    public String getFechaSeguroVehicular();
    
}