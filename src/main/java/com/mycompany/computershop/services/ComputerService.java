package com.mycompany.computershop.services;

import com.mycompany.computershop.model.Computer;

public interface ComputerService {

    Iterable<Computer> findAll();

    Computer findById(int id);

    void save(Computer computer);

    void remove(int computerId);

}
