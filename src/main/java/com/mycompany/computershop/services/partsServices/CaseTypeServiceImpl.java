package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.CaseType;
import com.mycompany.computershop.repositories.partsRepositories.CaseTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseTypeServiceImpl implements CaseTypeService {

    @Autowired
    private CaseTypeRepository caseTypeRepository;

    @Override
    public Iterable<CaseType> findAll() {
        return caseTypeRepository.findAll();
    }

    @Override
    public void save(CaseType caseType) {
        caseTypeRepository.save(caseType);
    }
}
