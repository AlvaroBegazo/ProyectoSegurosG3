package com.segurosx.models;

public class Certificado implements ICertificado {
    
    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarNumeroCertificado(Integer numero){
        System.out.println(numero);
    }

}