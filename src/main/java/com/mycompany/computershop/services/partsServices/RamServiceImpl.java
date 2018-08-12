package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.Ram;
import com.mycompany.computershop.repositories.partsRepositories.RamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RamServiceImpl implements RamService{

    @Autowired
    private RamRepository ramRepository;

    @Override
    public Iterable<Ram> findAll() {
        return ramRepository.findAll();
    }

    @Override
    public Ram findById(int ramId) {
        return ramRepository.findById(ramId).orElse(null);
    }

    @Override
    public void save(Ram ram) {
        ramRepository.save(ram);
    }

    @Override
    public void delete(int id) {
        ramRepository.deleteById(id);
    }
}
