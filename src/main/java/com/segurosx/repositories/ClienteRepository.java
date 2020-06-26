package com.segurosx.repositories;

import java.util.List;

import com.segurosx.models.Cliente;

public interface ClienteRepository {
    void create(Cliente customer);

    Cliente find(String id);

    List<Cliente> findAll();

    Cliente update(Cliente post, String id);

    void delete(String id);
    
}