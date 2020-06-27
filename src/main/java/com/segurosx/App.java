package com.segurosx;

import com.segurosx.models.Certificado;
import com.segurosx.models.Cliente;
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
        Poliza poli = new Poliza();
        poli.setNumero(4544);
        //creandocertificado
        Certificado cert = new Certificado();
        cert.setNumero(5555);  

        
        SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris");
        seguro.cacularRiesgo();
        cliente.setCompraSeguro(seguro);
        seguro.setPoliza(poli);
        seguro.setCertificado(cert);
        System.out.println("POLIZA:  " +  seguro.getPoliza().getNumero() + "\nCERTIFIFCADP: " + seguro.getCertificado().getNumero()); 
        cliente.getListaSeguroCliente();


   }
}
