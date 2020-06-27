package com.segurosx.models;

public class conectionCertificado  implements In{

    Certificado certificado;
    Poliza poliza;


    public void setCertificado(Certificado c){
        this.certificado = c;
    }
    public void setPoliza(Poliza p){
        this.poliza = p;
    }

    

    public Integer getCertificado(){
        return certificado.getNumero();
    }
    public Integer getPoliza(){
        return poliza.getNumero();
    }
}