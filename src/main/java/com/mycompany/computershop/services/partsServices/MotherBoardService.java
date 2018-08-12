package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.MotherBoard;

public interface MotherBoardService {

    Iterable<MotherBoard> findAll();

    MotherBoard findById(int motherBoardId);

    void save(MotherBoard motherBoard);

    void delete(int id);
}
