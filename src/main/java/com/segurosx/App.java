package com.segurosx;
import com.segurosx.models.Poliza;
import com.segurosx.models.Certificado;
import com.segurosx.models.SeguroAutoChoque;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.segurosx.models.CalculoPrimaPeru;
import com.segurosx.models.Cliente;
import com.segurosx.models.ICalculoPrima;
import com.segurosx.models.SeguroAutoRobo;
import com.segurosx.models.SeguroAutoSoat;
import com.segurosx.models.SeguroAutoTodoRiesgo;
// import com.segurosx.models.SeguroTarjeta;
import com.segurosx.models.SeguroVehicular;

/**
 * HRCS
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // PREGUNTA 5

        Cliente cliente2 = new Cliente("Profesor1");

        SeguroAutoChoque seguroAutoChoque =  new SeguroAutoChoque("Toyota2","Yaris2");
        seguroAutoChoque.calcularRiesgo();
        cliente2.setCompraSeguro(seguroAutoChoque);

        cliente2.getListaSeguroCliente();


        Cliente cliente3 = new Cliente("Profesor2");

        SeguroAutoRobo seguroAutoRobo =  new SeguroAutoRobo("Toyota3","Yaris3");
        seguroAutoRobo.calcularRiesgo();
        cliente3.setCompraSeguro(seguroAutoRobo);

        cliente3.getListaSeguroCliente();

        Cliente cliente4 = new Cliente("Profesor3");

        SeguroAutoSoat seguroSoat =  new SeguroAutoSoat("Toyota4","Yaris4");
        seguroSoat.calcularRiesgo();
        cliente4.setCompraSeguro(seguroSoat);

        cliente4.getListaSeguroCliente();

        Cliente cliente5 = new Cliente("Profesor4");

        SeguroAutoTodoRiesgo seguroAutoTodoRiesgo =  new SeguroAutoTodoRiesgo("Toyota5","Yaris5");
        seguroAutoTodoRiesgo.calcularRiesgo();
        cliente5.setCompraSeguro(seguroAutoTodoRiesgo);

        cliente5.getListaSeguroCliente();



        // PREGUNTA 6
        Cliente cliente8 = new Cliente("Juan Perez");
        
                //crando poliza
        Poliza poli = new Poliza();
        poli.setNumero(4544);
                //creandocertificado
        Certificado cert = new Certificado();
        cert.setNumero(5555);  

        
        SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris");
        seguro.calcularRiesgo();
        cliente8.setCompraSeguro(seguro);
        seguro.setPoliza(poli);
        seguro.setCertificado(cert);
        System.out.println("POLIZA:  " +  seguro.getPoliza().getNumero() + "\nCERTIFIFCADO: " + seguro.getCertificado().getNumero()); 
        cliente8.getListaSeguroCliente();




        // PREGUNTA 7

        /*
        
        */
        ArrayList<Certificado> a =  new ArrayList<Certificado>();
        Certificado c1 = new  Certificado();
        Certificado c2 = new  Certificado();
        Certificado c3 = new  Certificado();

        a.add(c1);
        a.add(c2);
        a.add(c3);

        ICalculoPrima x = new CalculoPrimaPeru(a);
        System.out.println("PRIMA: ");
        System.out.println(x.getPrima());







        // Cliente cliente2 = new Cliente("Profesor1");

        // SeguroAutoChoque seguroAutoChoque =  new SeguroAutoChoque("Toyota2","Yaris2");
        // seguroAutoChoque.cacularRiesgo();
        // cliente2.setCompraSeguro(seguroAutoChoque);

        // cliente2.getListaSeguroCliente();

        
        // Cliente cliente3 = new Cliente("Profesor2");

        // SeguroAutoRobo seguroAutoRobo =  new SeguroAutoRobo("Toyota3","Yaris3");
        // seguroAutoRobo.cacularRiesgo();
        // cliente3.setCompraSeguro(seguroAutoRobo);

        // cliente3.getListaSeguroCliente();

        // Cliente cliente4 = new Cliente("Profesor3");

        // SeguroAutoSoat seguroSoat =  new SeguroAutoSoat("Toyota4","Yaris4");
        // seguroSoat.cacularRiesgo();
        // cliente4.setCompraSeguro(seguroSoat);

        // cliente4.getListaSeguroCliente();

        // Cliente cliente5 = new Cliente("Profesor4");

        // SeguroAutoTodoRiesgo seguroAutoTodoRiesgo =  new SeguroAutoTodoRiesgo("Toyota5","Yaris5");
        // seguroAutoTodoRiesgo.cacularRiesgo();
        // cliente5.setCompraSeguro(seguroAutoTodoRiesgo);

        // cliente5.getListaSeguroCliente();


        // Cliente cliente = new Cliente("Juan Perez");
        
        
        // SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris");
        // seguro.calcularPrima();
        // seguro.cacularRiesgo();
        // cliente.setCompraSeguro(seguro);
        // cliente.getListaSeguroCliente();

   }
}
