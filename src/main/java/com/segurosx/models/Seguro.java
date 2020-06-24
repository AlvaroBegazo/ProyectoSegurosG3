package com.segurosx.models;

import java.util.Random;

public class Seguro {

    private Integer numero;
    
    private Certificado certificado;

    private Poliza poliza;

    public Seguro() {
        this.numero = new Integer(new Random().nextInt());
    }

    public Certificado getCertificado() {
        return certificado;
    }

    public void setCertificado(Certificado certificado) {
        this.certificado = certificado;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public String getDetalleSeguro()    {

        return "Numero: " + this.numero; 
               //"Poliza: " + this.getPoliza().getNumero() + " - " +
               //"Certificado: " + this.getCertificado().getNumero();
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

}