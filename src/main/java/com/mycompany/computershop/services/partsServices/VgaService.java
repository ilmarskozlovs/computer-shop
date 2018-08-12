package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.Vga;

public interface VgaService {

    Iterable<Vga> findAll();

    Vga findById(int vgaId);

    void save(Vga vga);

    void delete(int id);
}
