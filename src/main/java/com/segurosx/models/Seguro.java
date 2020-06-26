package com.segurosx.models;

import java.util.Random;

public abstract class Seguro {
    // 5. Implemente una nueva jerarquía de clases para Seguro Vehicular, que sea para seguro de auto por
    // robo, por choque, por todo riesgo y seguro SOAT. Utilice los principios LSP (sustitución de Liskov) e ISP.

    protected Integer numero;
    protected Certificado certificado;
    protected Poliza poliza;
    protected String nivelRiesgo = "NINGUNO";

    public Seguro() {
        this.numero = new Integer(new Random().nextInt());
    }

    // Getters y Setters

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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


    public String getNivelRiesgo()  {
        return this.nivelRiesgo;
    }


    public abstract String getDetalleSeguro();
    public abstract void cacularRiesgo();

}
