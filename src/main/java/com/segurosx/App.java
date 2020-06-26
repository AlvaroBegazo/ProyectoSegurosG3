package com.segurosx;

import com.segurosx.models.Cliente;
import com.segurosx.models.SeguroVehicular;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Cliente cliente = new Cliente("Juan Perez");
        SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris");
        seguro.cacularRiesgo();
        cliente.setCompraSeguro(seguro);
        cliente.getListaSeguroCliente();

   }
}
