package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.Hdd;

public interface HddService {

    Iterable<Hdd> findAll();

    Hdd findById(int hddId);

    void save(Hdd hdd);

    void delete(int id);
}
