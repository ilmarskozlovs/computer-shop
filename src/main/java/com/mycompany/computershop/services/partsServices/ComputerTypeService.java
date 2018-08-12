package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.ComputerType;

import java.util.Optional;

public interface ComputerTypeService {

    Iterable<ComputerType> findAll();

    ComputerType findById(int computerTypeId);

    void save(ComputerType computerType);

    void delete(int id);
}
