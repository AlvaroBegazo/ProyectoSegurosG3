package com.segurosx.models;

import com.segurosx.interfaces.IFormaPagoDebitoAutomatico;

public class DebidoAutomatico implements IFormaPagoDebitoAutomatico {

    @Override
    public void realizaDescuentoAutomaticoBanco() {
        
        System.out.println("Genera cargo en la cuenta de debito automatico");
    }
    
}