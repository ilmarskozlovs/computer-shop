package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.MemorySize;
import com.mycompany.computershop.repositories.partsRepositories.MemorySizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemorySizeServiceImpl implements MemorySizeService {

    @Autowired
    private MemorySizeRepository memorySizeRepository;

    @Override
    public Iterable<MemorySize> findAll() {
        return memorySizeRepository.findAll();
    }

    @Override
    public MemorySize getById(int id) {
        return memorySizeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(MemorySize memorySize) {
        memorySizeRepository.save(memorySize);
    }

    @Override
    public void deleteById(int id) {
        memorySizeRepository.deleteById(id);
    }
}
