package com.segurosx.models;

public class Poliza implements Inyec{

    private Integer numero;

    public Poliza (Integer numero){
        this.numero=numero;
    }
    
    @Override
    public Integer getNumero() {
        // TODO Auto-generated method stub
        return numero;
    }   
    
}