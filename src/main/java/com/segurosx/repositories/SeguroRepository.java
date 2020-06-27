package com.segurosx.repositories;

import java.util.List;

import com.segurosx.models.Seguro;

public interface SeguroRepository {
    void create(Seguro seguro);

    Seguro find(String id);

    List<Seguro> findAll();

    Seguro update(Seguro post, String id);

    void delete(String id);
    
}