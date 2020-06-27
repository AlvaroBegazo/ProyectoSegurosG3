package com.segurosx.models;

public class conectionCertificado  implements ICertificado{

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

    
	@Override
	public void setNumeroCertificado(Integer c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Integer getNumeroCertificado() {
		// TODO Auto-generated method stub
		return null;
	}
}