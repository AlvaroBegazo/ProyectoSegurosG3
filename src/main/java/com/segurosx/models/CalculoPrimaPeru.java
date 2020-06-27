package com.segurosx.models;

import java.util.ArrayList;

public class CalculoPrimaPeru implements ICalculoPrima{
    
    protected  ArrayList<Certificado> certificados;

    public CalculoPrimaPeru(final ArrayList<Certificado> certificados){
        this.certificados = certificados;
    }

    public CalculoPrimaPeru(){

    }

    
	public ArrayList<Certificado> getCertificados() {
        return certificados;
	}
    
    public Double getPrima(){
        return 10000.0;
    }
}