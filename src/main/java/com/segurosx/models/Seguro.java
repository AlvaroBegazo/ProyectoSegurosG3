package com.segurosx.models;

import java.util.Random;

public abstract class Seguro{

    protected Integer numero;
    // protected String pol;
    // protected String cer;
    protected Certificado certificado;
    protected Poliza poliza;
    protected String nivelRiesgo = "NINGUNO";


    protected In ann;

    public Seguro() {
        this.numero = new Integer(new Random().nextInt());
    }

    public void setCertificado(Certificado a){
        ann.setCertificado(a);
    }

    // public void getCertificado()


    // public Certificado getCertificado() {
    //     return certificado;
    // }

    // public void setCertificado(Certificado certificado) {
    //     this.certificado = certificado;
    // }
    

    // public Poliza getPoliza() {
    //     return poliza;
    // }

    // public void setPoliza(Poliza poliza) {
    //     this.poliza = poliza;
    // }


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
