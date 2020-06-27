package com.segurosx.models;

import java.util.List;

public interface ICliente {

    public List<SeguroVehicular> setCompraSeguroVehicular(SeguroVehicular seguro);

    public List<SeguroTarjeta> setCompraSeguroTarjeta(SeguroTarjeta seguro);


}