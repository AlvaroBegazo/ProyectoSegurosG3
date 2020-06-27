package com.segurosx.models;

public class Certificado implements  Inyec{
    
    private Integer numero;
    
    public Certificado(Integer  numero){
        this.numero = numero;
    }
    
   @Override
   public Integer getNumero() {
       // TODO Auto-generated method stub
       return numero;
   }
    
}       