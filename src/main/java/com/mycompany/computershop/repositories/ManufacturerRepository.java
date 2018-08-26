package com.mycompany.computershop.repositories;

import com.mycompany.computershop.model.parts.Manufacturer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends CrudRepository<Manufacturer, Integer> {
}
