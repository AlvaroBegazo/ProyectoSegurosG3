package com.segurosx.models;

public class Poliza {

    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void mostrarNumeroPoliza(Integer numero){
        System.out.println(numero);
    }
}