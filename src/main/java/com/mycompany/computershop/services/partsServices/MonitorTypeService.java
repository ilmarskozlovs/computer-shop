package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.MonitorType;

public interface MonitorTypeService {

    Iterable<MonitorType> findAll();

    MonitorType getById(int id);

    void save(MonitorType monitorType);

    void delete(int id);
}
