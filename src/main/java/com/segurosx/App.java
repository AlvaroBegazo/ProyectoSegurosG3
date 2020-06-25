package com.segurosx;

import com.segurosx.models.Cliente;
import com.segurosx.models.SeguroTarjeta;
import com.segurosx.models.SeguroVehicular;

/**
 * HRCS
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

        SeguroTarjeta seguro2 = new SeguroTarjeta("BCP");
        seguro2.cacularRiesgo();
        cliente.setCompraSeguro(seguro2);

        
        SeguroTarjeta seguro3 = new SeguroTarjeta("AZTECA");
        seguro3.cacularRiesgo();
        cliente.setCompraSeguro(seguro3);

        cliente.getListaSeguroCliente();

   }
}
