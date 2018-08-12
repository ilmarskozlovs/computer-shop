package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.Cpu;

public interface CpuService {

    Iterable<Cpu> findAll();

    Cpu findById(int cpuId);

    void save(Cpu cpu);

    void delete(int id);
}
