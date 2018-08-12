package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.MotherBoard;
import com.mycompany.computershop.repositories.partsRepositories.MotherBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotherBoardServiceImpl implements MotherBoardService {

    @Autowired
    private MotherBoardRepository motherBoardRepository;

    @Override
    public Iterable<MotherBoard> findAll() {
        return motherBoardRepository.findAll();
    }

    @Override
    public MotherBoard findById(int motherBoardId) {
        return motherBoardRepository.findById(motherBoardId).orElse(null);
    }

    @Override
    public void save(MotherBoard motherBoard) {
        motherBoardRepository.save(motherBoard);
    }

    @Override
    public void delete(int id) {
        motherBoardRepository.deleteById(id);
    }
}
