package com.segurosx.models;

// public class SeguroRobo extends Seguro implements ISeguro {
public class SeguroRobo extends Seguro  {
    
    protected Integer montoRobado;
    // protected Integer estimacionRobo;

    // public SeguroRobo (int montoRobado, Integer estimacionRobo){
    public SeguroRobo (Integer montoRobado){
        super();
        this.montoRobado = montoRobado;
        // this.estimacionRobo = estimacionRobo;
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