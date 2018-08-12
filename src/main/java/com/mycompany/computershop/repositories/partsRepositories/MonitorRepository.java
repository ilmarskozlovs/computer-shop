package com.mycompany.computershop.repositories.partsRepositories;

import com.mycompany.computershop.model.parts.Monitor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MonitorRepository extends CrudRepository<Monitor, Integer> {
}
