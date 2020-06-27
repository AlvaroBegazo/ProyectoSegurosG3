package com.segurosx.models;

import java.util.Random;

public abstract class Seguro {

    protected Integer numero;
    protected Inyec certificado;
    protected Inyec poliza;
    protected String nivelRiesgo = "NINGUNO";
    protected String bancoTarjeta;
    protected String marca;
    protected String modelo;

    public Seguro() {
        this.numero = new Integer(new Random().nextInt());
    }

    
    public void setPoliza(Inyec poliza){
       this.poliza=poliza; 
    }
    public void setCertificado(Inyec certificado) {
        this.certificado = certificado;
    }
    public Inyec getCertificado() {
        return certificado;
    }
    public Inyec getPoliza() {
        return poliza;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNivelRiesgo()  {
        return this.nivelRiesgo;
    }

    public abstract String getDetalleSeguro();

    public abstract void cacularRiesgo();

}
