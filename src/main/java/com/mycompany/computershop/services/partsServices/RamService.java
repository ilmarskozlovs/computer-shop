package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.Ram;

public interface RamService {

    Iterable<Ram> findAll();

    Ram findById(int ramId);

    void save(Ram ram);

    void delete(int id);
}
