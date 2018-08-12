package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.ComputerType;
import com.mycompany.computershop.repositories.partsRepositories.ComputerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerTypeServiceImpl implements ComputerTypeService {

    @Autowired
    private ComputerTypeRepository computerTypeRepository;

    @Override
    public Iterable<ComputerType> findAll() {
        return computerTypeRepository.findAll();
    }

    @Override
    public ComputerType findById(int computerTypeId) {
        return computerTypeRepository.findById(computerTypeId).orElse(null);
    }

    @Override
    public void save(ComputerType computerType) {
        computerTypeRepository.save(computerType);
    }

    @Override
    public void delete(int id) {
        computerTypeRepository.deleteById(id);
    }
}
