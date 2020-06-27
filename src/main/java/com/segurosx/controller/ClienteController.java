package com.segurosx.controller;

import com.segurosx.config.Paths;
import com.segurosx.models.Cliente;
import com.segurosx.repositories.ClienteRepository;

import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpStatus;

import io.javalin.http.BadRequestResponse;
import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;

public class ClienteController {

    private static final String ID = "id";

    private ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository postRepository) {
        this.clienteRepository = postRepository;
    }
    
    public void create(Context context) {
        Cliente cliente = context.bodyAsClass(Cliente.class);

        if (cliente.getId() != null) {
            throw new BadRequestResponse(String.format("Unable to create a new post with existing id: %s", cliente));
        }

        clienteRepository.create(cliente);
        context.status(HttpStatus.CREATED_201)
                .header(HttpHeader.LOCATION.name(), Paths.formatPostLocation(cliente.getId().toString()));
    }

    public void delete(Context context) {
        clienteRepository.delete(context.pathParam(ID));
    }

    public void find(Context context) {
        String id = context.pathParam(ID);
        Cliente cliente = clienteRepository.find(id);

        if (cliente == null) {
            throw new NotFoundResponse(String.format("A cliente with id '%s' is not found", id));
        }

        context.json(cliente);
    }

    public void findAll(Context context) {
        context.json(clienteRepository.findAll());
    }

    public void update(Context context) {
        Cliente cliente = context.bodyAsClass(Cliente.class);
        String id = context.pathParam(ID);

        if (cliente.getId() != null && !cliente.getId().toString().equals(id)) {
            throw new BadRequestResponse("Id update is not allowed");
        }

        clienteRepository.update(cliente, id);
    }

    
}