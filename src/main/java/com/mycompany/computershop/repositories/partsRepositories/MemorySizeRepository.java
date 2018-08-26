package com.mycompany.computershop.repositories.partsRepositories;

import com.mycompany.computershop.model.parts.MemorySize;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemorySizeRepository extends CrudRepository<MemorySize, Integer> {
}
