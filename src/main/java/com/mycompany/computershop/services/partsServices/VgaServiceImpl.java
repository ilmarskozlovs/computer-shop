package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.Vga;
import com.mycompany.computershop.repositories.partsRepositories.VgaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VgaServiceImpl implements VgaService {

    @Autowired
    private VgaRepository vgaRepository;

    @Override
    public Iterable<Vga> findAll() {
        return vgaRepository.findAll();
    }

    @Override
    public Vga findById(int vgaId) {
        return vgaRepository.findById(vgaId).orElse(null);
    }

    @Override
    public void save(Vga vga) {
        vgaRepository.save(vga);
    }

    @Override
    public void delete(int id) {
        vgaRepository.deleteById(id);
    }
}
