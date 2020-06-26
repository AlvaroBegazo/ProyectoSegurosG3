package com.segurosx.models;

// public class SeguroChoque extends Seguro implements ISeguro {
public class SeguroChoque extends Seguro  {
    
    protected Integer montoRobado;
    // protected Integer estimacionRobo;
    
    public SeguroChoque(){

    }

    @Override
    public void cacularRiesgo()   {

        if (this.montoRobado >= 5000) {
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
}

// FALTA