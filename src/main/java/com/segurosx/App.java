package com.segurosx;

import com.segurosx.models.Certificado;
import com.segurosx.models.Cliente;
import com.segurosx.models.Inyec;
import com.segurosx.models.Poliza;
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
        
        //crando poliza
        Inyec poli = new Poliza(12);
        
        //creandocertificado
        Inyec cert = new Certificado(456);
       

        
        SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris");
        seguro.cacularRiesgo();
        cliente.setCompraSeguro(seguro);
        seguro.setPoliza(poli);
        seguro.setCertificado(cert);
        System.out.println("POLIZA:  " +  seguro.getPoliza().getNumero() + "\nCERTIFIFCADP: " + seguro.getCertificado().getNumero()); 
        cliente.getListaSeguroCliente();


   }
}
