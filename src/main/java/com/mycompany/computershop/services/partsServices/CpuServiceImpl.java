package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.Cpu;
import com.mycompany.computershop.repositories.partsRepositories.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CpuServiceImpl implements CpuService {

    @Autowired
    private CpuRepository cpuRepository;

    @Override
    public Iterable<Cpu> findAll() {
        return cpuRepository.findAll();
    }

    @Override
    public Cpu findById(int cpuId) {
        return cpuRepository.findById(cpuId).orElse(null);
    }

    @Override
    public void save(Cpu cpu) {
        cpuRepository.save(cpu);
    }

    @Override
    public void delete(int id) {
        cpuRepository.deleteById(id);
    }
}
