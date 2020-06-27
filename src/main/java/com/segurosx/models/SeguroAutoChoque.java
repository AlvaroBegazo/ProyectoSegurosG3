package com.segurosx.models;

public class SeguroAutoChoque  extends SeguroVehicular {

	public SeguroAutoChoque(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public String getDetalleSeguro()    {

        return "Seg. Auto Choque Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }

    /*
    public String mensajeAutoChoque(){

        return "La marca: " + marca + "El modelo es: " + modelo;
    }
*/
}