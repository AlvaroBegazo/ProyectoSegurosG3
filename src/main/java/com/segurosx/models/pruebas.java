package com.segurosx.models;

public class pruebas {
    public static void main( String[] args ){
        Cliente cliente = new Cliente("Juan Perez");
        SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris");
        seguro.cacularRiesgo();
        cliente.setCompraSeguro(seguro);
        cliente.getListaSeguroCliente();

        Cliente cliente1 = new Cliente("Juan Perez");
        SeguroVehicular seguro1 = new SeguroVehicular("Toyota","Yaris");
        seguro1.cacularRiesgo();

        // Cliente cliente2 = new Cliente("Juan Perez");
        SeguroTarjeta seguro2 = new SeguroTarjeta("AZTECA");
        seguro2.cacularRiesgo();

        // Cliente cliente3 = new Cliente("Juan Perez");
        SeguroRobo seguro3 = new SeguroRobo(100);
        seguro3.cacularRiesgo();

        // Cliente cliente4 = new Cliente("Juan Perez");
        // SeguroVehicular seguro4 = new SeguroVehicular("Toyota","Yaris");
        // seguro.cacularRiesgo();

        // Cliente cliente5 = new Cliente("Juan Perez");
        // SeguroVehicular seguro5 = new SeguroVehicular("Toyota","Yaris");
        // seguro.cacularRiesgo();

        // Cliente cliente6 = new Cliente("Juan Perez");
        // SeguroVehicular seguro6 = new SeguroVehicular("Toyota","Yaris");
        // seguro.cacularRiesgo();

        cliente1.setCompraSeguro(seguro1);
        cliente1.setCompraSeguro(seguro2);
        cliente1.setCompraSeguro(seguro3);
        // cliente1.setCompraSeguro(seguro4);
        // cliente1.setCompraSeguro(seguro5);
        // cliente1.setCompraSeguro(seguro6);

        cliente1.getListaSeguroCliente();

   }
}


