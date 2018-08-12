package com.mycompany.computershop.services;

import com.mycompany.computershop.model.Computer;
import com.mycompany.computershop.repositories.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerServiceImpl implements ComputerService{

    @Autowired
    private ComputerRepository computerRepository;

    @Override
    public Iterable<Computer> findAll() {
        return computerRepository.findAll();
    }

    @Override
    public Computer findById(int id) {
        return computerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Computer computer) {
        computerRepository.save(computer);
    }

    @Override
    public void remove(int computerId) {
        computerRepository.deleteById(computerId);
    }
}
