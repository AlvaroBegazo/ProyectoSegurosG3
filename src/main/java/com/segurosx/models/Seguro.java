package com.segurosx.models;

import java.util.Random;

public abstract class Seguro {
    private String id;
    protected Integer numero;
    protected Certificado certificado;
    protected Poliza poliza;
    protected String seguroTipo;
    protected String nivelRiesgo = "NINGUNO";
    protected String banco;
    protected String marca;
    protected String modelo;

    public Seguro() {
        this.numero = new Integer(new Random().nextInt());
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNivelRiesgo()  {
        return this.nivelRiesgo;
    }

    public String getSeguroTipo() {
        return seguroTipo;
    }

    public void setSeguroTipo(String seguroTipo) {
        this.seguroTipo = seguroTipo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
