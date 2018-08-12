package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.Monitor;
import com.mycompany.computershop.repositories.partsRepositories.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonitorServiceImpl implements MonitorService {

    @Autowired
    private MonitorRepository monitorRepository;

    @Override
    public Iterable<Monitor> findAll() {
        return monitorRepository.findAll();
    }

    @Override
    public Monitor findById(int monitorId) {
        return monitorRepository.findById(monitorId).orElse(null);
    }

    @Override
    public void save(Monitor monitor) {
        monitorRepository.save(monitor);
    }

    @Override
    public void delete(int id) {
        monitorRepository.deleteById(id);
    }
}
