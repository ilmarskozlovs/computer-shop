package com.mycompany.computershop.repositories.partsRepositories;

import com.mycompany.computershop.model.parts.ComputerCase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ComputerCaseRepository extends CrudRepository<ComputerCase, Integer> {
}
