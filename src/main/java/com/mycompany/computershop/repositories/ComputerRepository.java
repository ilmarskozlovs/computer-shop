package com.mycompany.computershop.repositories;

import com.mycompany.computershop.model.Computer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ComputerRepository extends CrudRepository<Computer, Integer> {
}
