package com.mycompany.computershop.services;

import com.mycompany.computershop.model.parts.Manufacturer;

public interface ManufacturerService {

    Iterable<Manufacturer> findAll();

    Manufacturer findById(int id);

    void save(Manufacturer manufacturer);

    void remove(int id);


}
