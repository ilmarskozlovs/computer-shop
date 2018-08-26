package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.MemorySize;

public interface MemorySizeService {

    Iterable<MemorySize> findAll();

    MemorySize getById(int id);

    void save(MemorySize memorySize);

    void deleteById(int id);
}
