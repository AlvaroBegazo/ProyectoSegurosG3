package com.segurosx.controller;

import com.segurosx.config.Paths;
import com.segurosx.models.ISeguroTarjeta;
import com.segurosx.models.ISeguroVehicular;
import com.segurosx.models.Seguro;
import com.segurosx.models.SeguroTarjeta;
import com.segurosx.models.SeguroVehicular;
import com.segurosx.repositories.SeguroRepository;

import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpStatus;

import io.javalin.http.BadRequestResponse;
import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;

public class SeguroController {

    private static final String ID = "id";

    private SeguroRepository seguroRepository;

    private ISeguroVehicular iSeguroVehicular;

    private ISeguroTarjeta iSeguroTarjeta;

    public SeguroController(SeguroRepository postRepository) {
        this.seguroRepository = postRepository;
    }
    
    public void create(Context context) {
        Seguro seguro = context.bodyAsClass(Seguro.class);

        if (seguro.getId() != null) {
            throw new BadRequestResponse(String.format("Unable to create a new post with existing id: %s", seguro));
        }

        seguroRepository.create(seguro);
        context.status(HttpStatus.CREATED_201)
                .header(HttpHeader.LOCATION.name(), Paths.formatPostLocation(seguro.getId().toString()));
    }

    public void delete(Context context) {
        seguroRepository.delete(context.pathParam(ID));
    }

    public void find(Context context) {
        String id = context.pathParam(ID);
        Seguro seguro = seguroRepository.find(id);

        if (seguro == null) {
            throw new NotFoundResponse(String.format("A seguro with id '%s' is not found", id));
        }

        context.json(seguro);
    }

    public void findAll(Context context) {
        context.json(seguroRepository.findAll());
    }

    public void update(Context context) {
        Seguro seguro = context.bodyAsClass(Seguro.class);
        String id = context.pathParam(ID);

        if (seguro.getId() != null && !seguro.getId().toString().equals(id)) {
            throw new BadRequestResponse("Id update is not allowed");
        }

        seguroRepository.update(seguro, id);
    }


    public void validarTipoSeguro(Seguro seguro, ISeguroVehicular iSeguroVehicular, ISeguroTarjeta iSeguroTarjeta) {
        if(seguro.getSeguroTipo().equals("Vehicular")){
          this.iSeguroVehicular = iSeguroVehicular;
          String nivelRiesgoVehicular =   iSeguroVehicular.calcularRiesgoVehicular(seguro.getMarca(), seguro.getModelo());
          System.out.println(iSeguroVehicular.getDetalleSeguroVehicular(seguro.getNumero(), nivelRiesgoVehicular));
        }else if(seguro.getSeguroTipo().equals("Tarjeta")){
            this.iSeguroTarjeta = iSeguroTarjeta;
            String nivelRiesgoTarjeta = iSeguroTarjeta.calcularRiesgoTarjeta(seguro.getBanco());
            System.out.println(iSeguroTarjeta.getDetalleSeguroTarjeta(seguro.getNumero(), nivelRiesgoTarjeta));
        }
    }
    
}