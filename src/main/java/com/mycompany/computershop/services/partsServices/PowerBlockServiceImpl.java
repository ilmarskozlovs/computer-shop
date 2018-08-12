package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.PowerBlock;
import com.mycompany.computershop.repositories.partsRepositories.PowerBlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PowerBlockServiceImpl implements PowerBlockService {

    @Autowired
    private PowerBlockRepository powerBlockRepository;

    @Override
    public Iterable<PowerBlock> findAll() {
        return powerBlockRepository.findAll();
    }

    @Override
    public PowerBlock findById(int powerBlockId) {
        return powerBlockRepository.findById(powerBlockId).orElse(null);
    }

    @Override
    public void save(PowerBlock powerBlock) {
        powerBlockRepository.save(powerBlock);
    }

    @Override
    public void delete(int id) {
        powerBlockRepository.deleteById(id);
    }
}
