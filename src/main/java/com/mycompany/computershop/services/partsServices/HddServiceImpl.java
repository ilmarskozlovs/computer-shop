package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.Hdd;
import com.mycompany.computershop.repositories.partsRepositories.HddRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HddServiceImpl implements HddService {

    @Autowired
    private HddRepository hddRepository;

    @Override
    public Iterable<Hdd> findAll() {
        return hddRepository.findAll();
    }

    @Override
    public Hdd findById(int hddId) {
        return hddRepository.findById(hddId).orElse(null);
    }

    @Override
    public void save(Hdd hdd) {
        hddRepository.save(hdd);
    }

    @Override
    public void delete(int id) {
        hddRepository.deleteById(id);
    }
}
