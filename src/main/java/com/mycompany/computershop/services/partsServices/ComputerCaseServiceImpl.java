package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.ComputerCase;
import com.mycompany.computershop.repositories.partsRepositories.ComputerCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerCaseServiceImpl implements ComputerCaseService {

    @Autowired
    private ComputerCaseRepository computerCaseRepository;

    @Override
    public Iterable<ComputerCase> findAll() {
        return computerCaseRepository.findAll();
    }

    @Override
    public ComputerCase findById(int computerCaseId) {
        return computerCaseRepository.findById(computerCaseId).orElse(null);
    }

    @Override
    public void save(ComputerCase computerCase) {
        computerCaseRepository.save(computerCase);
    }

    @Override
    public void delete(int id) {
        computerCaseRepository.deleteById(id);
    }

}
