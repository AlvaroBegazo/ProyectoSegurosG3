package com.segurosx;

import io.javalin.Javalin;
import io.javalin.plugin.openapi.OpenApiOptions;
import io.javalin.plugin.openapi.OpenApiPlugin;
import io.javalin.plugin.openapi.ui.SwaggerOptions;
import io.swagger.v3.oas.models.info.Info;

import com.segurosx.config.DBConnectionManager;
import com.segurosx.controller.ClienteController;
import com.segurosx.repositories.impl.ClienteRepositoryImpl;

/**
 * HRCS
 *
 */
public class App 
{

    private final DBConnectionManager manager;
    private final ClienteController clienteController;

    public App()
    {
        this.manager =  new DBConnectionManager();
      
        ClienteRepositoryImpl clienteRepositoryImpl =  new ClienteRepositoryImpl(this.manager.getDatabase());
        this.clienteController = new ClienteController(clienteRepositoryImpl);
      }

    public static void main( String[] args )
    {
        new App().iniciar();
        /*
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
        */
    
   }

   public void iniciar(){

    Info applicationInfo = new Info()
        .version("1.0")
        .description("Seguro API");
    OpenApiOptions openApi = new OpenApiOptions(applicationInfo)
        .path("/api")
        .swagger(new SwaggerOptions("/api-ui")); // endpoint for swagger-ui
    Javalin app =  Javalin.create(
        config -> {
        config.registerPlugin(new OpenApiPlugin(openApi));
    }
    ).start(7250); 

    //registrar cliente
    app.get("/api/RegistrarCliente", this.clienteController::create);

   }

}
