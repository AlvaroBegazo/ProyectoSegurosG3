package com.segurosx.models;

import java.util.Random;

public abstract class Seguro{
// Mejore la implementación de Seguro con Poliza y Certificado para llamarlas desde la clase cliente App.java respetando el principio de DIP (inversión de dependencia).

    protected Integer numero;
    protected Certificado certificado;
    protected Poliza poliza;
    protected String nivelRiesgo = "NINGUNO";
    

    protected ICertificado ann;
    protected ICalculoPrima iCalculoPrima;

    public Seguro() {
        this.numero = new Integer(new Random().nextInt());
    }

    public Seguro(ICalculoPrima iCalculoPrima) {
        this.iCalculoPrima = iCalculoPrima;
    }

    public void setCertificado(Certificado a){
        ann.setCertificado(a);
    }

    public void calcularPrima(){
        // Double prima = calculador.getPrima();
        System.out.println(iCalculoPrima.getPrima());
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

    // public String getNivelRiesgo()  {
    //     return this.nivelRiesgo;
    // }




    public abstract String getDetalleSeguro();

    public abstract void cacularRiesgo();

    public abstract void calcularRiesgo();
    public abstract String getNivelRiesgo();





}
