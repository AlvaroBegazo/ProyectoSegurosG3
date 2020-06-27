package com.segurosx.models;

import java.util.ArrayList;
import java.util.List;

public class IClienteImpl implements ICliente {
    

    @Override
    public List<SeguroVehicular> setCompraSeguroVehicular(SeguroVehicular seguro) {
        List<SeguroVehicular> seguros = new ArrayList<>();
        seguros.add(seguro);

        return seguros;
    }

    @Override
    public List<SeguroTarjeta> setCompraSeguroTarjeta(SeguroTarjeta seguro) {
        List<SeguroTarjeta> seguros = new ArrayList<>();
        seguros.add(seguro);

        return seguros;
    }
    
}