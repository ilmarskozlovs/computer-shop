package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.CaseType;

public interface CaseTypeService {

    Iterable<CaseType> findAll();

    void save(CaseType caseType);

}
