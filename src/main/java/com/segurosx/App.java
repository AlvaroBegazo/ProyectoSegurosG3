package com.segurosx;

import io.javalin.Javalin;
import io.javalin.plugin.openapi.OpenApiOptions;
import io.javalin.plugin.openapi.OpenApiPlugin;
import io.javalin.plugin.openapi.ui.SwaggerOptions;
import io.swagger.v3.oas.models.info.Info;

import com.segurosx.config.DBConnectionManager;
import com.segurosx.controller.ClienteController;
import com.segurosx.controller.SeguroController;
import com.segurosx.repositories.impl.ClienteRepositoryImpl;
import com.segurosx.repositories.impl.SeguroRepositoryImpl;


public class App 
{

    private final DBConnectionManager manager;
    private final ClienteController clienteController;
    private final SeguroController seguroController;

    public App()
    {
        this.manager =  new DBConnectionManager();
      
        ClienteRepositoryImpl clienteRepositoryImpl =  new ClienteRepositoryImpl(this.manager.getDatabase());
        this.clienteController = new ClienteController(clienteRepositoryImpl);

        SeguroRepositoryImpl seguroRepositoryImpl =  new SeguroRepositoryImpl(this.manager.getDatabase());
        this.seguroController = new SeguroController(seguroRepositoryImpl);

      }

    public static void main( String[] args )
    {
        new App().iniciar();

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

    //registrar seguro vehicular
    app.get("/api/RegistrarSeguroVehicular", this.seguroController::create);


    //registrar seguro tarjeta
    app.get("/api/RegistrarSeguroTarjeta", this.seguroController::create);

    //cliente compra seguro
   // app.get("/api/ComprarSeguro/:id", this.clienteController::comprarSeguro);


   }

}

