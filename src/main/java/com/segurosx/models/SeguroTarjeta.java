package com.segurosx.models;

public class SeguroTarjeta extends Seguro {

    private String bancoTarjeta;
  

    public SeguroTarjeta(String bancoTarjeta)    {

        super();
        this.bancoTarjeta = bancoTarjeta;
    }

    @Override
    public String toString() {
        return "SeguroTarjeta [bancoTarjeta=" + bancoTarjeta + "]";
    }

}