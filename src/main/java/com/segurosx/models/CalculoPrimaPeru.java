package com.segurosx.models;

import java.util.ArrayList;

public class CalculoPrimaPeru implements ICalculoPrima{
    
    private final ArrayList<Certificado> certificados;

    public CalculoPrimaPeru(final ArrayList<Certificado> certificados){
        this.certificados = certificados;
    }

    public Double getPrima(){
        return 20.0;
    }

	public ArrayList<Certificado> getCertificados() {
		return certificados;
	}

}