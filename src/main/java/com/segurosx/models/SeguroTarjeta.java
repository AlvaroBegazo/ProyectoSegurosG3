package com.segurosx.models;

public class SeguroTarjeta extends Seguro implements ISeguroTarjeta {

    protected String bancoTarjeta;
  

    public SeguroTarjeta(String bancoTarjeta)    {

        super();
        this.bancoTarjeta = bancoTarjeta;
    }

    @Override
    public void cacularRiesgo()   {

        if (this.bancoTarjeta.equals("AZTECA")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 
    }

    @Override
    public String getDetalleSeguro() {
        
        return "Seg. Tarjeta Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }

	@Override
	public String getFechaTarjeta() {
        return "26/6/2020";
    }
    
}