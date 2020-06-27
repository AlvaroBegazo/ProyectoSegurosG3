package com.segurosx.models;

public class Certificado   {
    
    private Integer numero;
    private ICertificado ic;
    
    public Certificado(ICertificado ic) {
        this.ic = ic;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        
        this.numero = numero;
        
    }
    // public void setObject( Integer numero ){
    //     this.numero = numero;
    // }

}