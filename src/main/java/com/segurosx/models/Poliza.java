package com.segurosx.models;

public class Poliza implements Inyec{

    private Integer numero;

    @Override
    public Integer getNumero() {
        // TODO Auto-generated method stub
        return numero;
    }
    @Override
    public void setNumero(Integer numero) {
        // TODO Auto-generated method stub
        this.numero=numero;
    }
}