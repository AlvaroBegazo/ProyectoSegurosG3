package com.segurosx.models;

public class DebitoCupon implements IFormaPagoCupon, IFormaPagoDebitoAutomatico{

    @Override
    public void realizaDescuentoAutomaticoBanco() {
        System.out.println("Genera cargo en la cuenta de debito automatico");

    }

    @Override
    public void generaCuponPago() {

        System.out.println("Genera Cupon de pago 1");
        System.out.println("Genera Cupon de pago 2");
    }

    @Override
    public void programaFechaVencimientoCuponPago() {
        
        System.out.println("Programa fecha de vencimiento cupon 1 en julio 2020");
        System.out.println("Programa fecha de vencimiento cupon 2 en agosto 2020");
    }
    
}