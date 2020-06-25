package com.segurosx.models;

public class DebidoAutomatico implements IFormaPagoDebitoAutomatico {

    // Con esto, solo se implementa las funciones que solo se debe usar la clase
    @Override
    public void realizaDescuentoAutomaticoBanco() {
        System.out.println("Genera cargo en la cuenta de debito automatico");
    }
    
}