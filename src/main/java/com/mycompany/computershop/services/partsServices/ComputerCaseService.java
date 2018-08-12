package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.ComputerCase;


public interface ComputerCaseService {

    Iterable<ComputerCase> findAll();

    ComputerCase findById(int computerCaseId);

    void save(ComputerCase computerCase);

    void delete(int id);

}
