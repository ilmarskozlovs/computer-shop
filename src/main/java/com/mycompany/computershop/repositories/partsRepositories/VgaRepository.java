package com.mycompany.computershop.repositories.partsRepositories;

import com.mycompany.computershop.model.parts.Vga;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface VgaRepository extends CrudRepository<Vga, Integer> {
}
