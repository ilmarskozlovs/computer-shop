package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.PowerBlock;

public interface PowerBlockService {

    Iterable<PowerBlock> findAll();

    PowerBlock findById(int powerBlockId);

    void save(PowerBlock powerBlock);

    void delete(int id);
}
