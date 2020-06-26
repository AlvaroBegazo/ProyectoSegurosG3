package com.segurosx.repositories.impl;

import static com.mongodb.client.model.Filters.eq;

import java.util.LinkedList;
import java.util.List;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.FindOneAndReplaceOptions;
import com.mongodb.client.model.ReturnDocument;
import com.segurosx.models.Cliente;
import com.segurosx.repositories.ClienteRepository;

import org.bson.Document;
import org.bson.types.ObjectId;

public class ClienteRepositoryImpl implements ClienteRepository {

    private static final String COLLECTION_NAME = "clientes";
    private static final FindOneAndReplaceOptions UPDATE_OPTIONS = new FindOneAndReplaceOptions()
            .returnDocument(ReturnDocument.AFTER);

    private final MongoCollection<Cliente> clientes;

    public ClienteRepositoryImpl(MongoDatabase database) {
        this.clientes = database.getCollection(COLLECTION_NAME, Cliente.class);
    }

    @Override
    public void create(Cliente cliente) {
        System.out.println("entrando: " + cliente);
        cliente.setId((new ObjectId()).toString());
        clientes.insertOne(cliente);
    }

    @Override
    public Cliente find(String id) {
        //System.out.println("_id: " + id);
        return clientes.find(eq("_id", id)).first();
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> result = new LinkedList<>();

        for (Cliente cliente : clientes.find()) {
            result.add(cliente);
        }

        return result;
    }

    @Override
    public Cliente update(Cliente post, String id) {
        return clientes.findOneAndReplace(new Document("_id", id), post, UPDATE_OPTIONS);
    }

    @Override
    public void delete(String id) {
        clientes.deleteOne(new Document("_id", id));
    }
    
}