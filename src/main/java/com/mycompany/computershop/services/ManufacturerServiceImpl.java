package com.mycompany.computershop.services;

import com.mycompany.computershop.model.parts.Manufacturer;
import com.mycompany.computershop.repositories.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManufacturerServiceImpl implements ManufacturerService{

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    @Override
    public Iterable<Manufacturer> findAll() {
        return manufacturerRepository.findAll();
    }

    @Override
    public Manufacturer findById(int id) {
        return manufacturerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Manufacturer manufacturer) {
        manufacturerRepository.save(manufacturer);
    }

    @Override
    public void remove(int id) {
        manufacturerRepository.deleteById(id);
    }
}
