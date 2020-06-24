package com.segurosx.models;

public class SeguroTarjeta {

    private Integer numero;
    
    private String bancoTarjeta;

    private String nivelRiesgo = "NINGUNO";

    public SeguroTarjeta(String bancoTarjeta)    {

        this.bancoTarjeta = bancoTarjeta;
    }

    public void cacularRiesgo()   {

        if (this.bancoTarjeta.equals("AZTECA")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 
    }

    public String getNivelRiesgo()  {
        return this.nivelRiesgo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}