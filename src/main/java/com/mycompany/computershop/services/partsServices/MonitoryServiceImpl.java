package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.MonitorType;
import com.mycompany.computershop.repositories.partsRepositories.MonitorTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonitoryServiceImpl implements MonitorTypeService {

    @Autowired
    private MonitorTypeRepository monitorTypeRepository;

    @Override
    public Iterable<MonitorType> findAll() {
        return monitorTypeRepository.findAll();
    }

    @Override
    public MonitorType getById(int id) {
        return monitorTypeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(MonitorType monitorType) {
        monitorTypeRepository.save(monitorType);
    }

    @Override
    public void delete(int id) {
        monitorTypeRepository.deleteById(id);
    }
}
