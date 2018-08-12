package com.mycompany.computershop.services.partsServices;

import com.mycompany.computershop.model.parts.Monitor;

public interface MonitorService {

    Iterable<Monitor> findAll();

    Monitor findById(int monitorId);

    void save(Monitor monitor);

    void delete(int id);
}
