package com.mycompany.computershop.model.parts;

import com.mycompany.computershop.model.Computer;

import javax.persistence.*;
import java.util.List;

@Entity
public class Monitor {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;

    private double price;

    @ManyToOne
    private MonitorType monitorType;

    @ManyToOne
    private Manufacturer manufacturer;

    private double width;

    @OneToMany
    @JoinColumn(name = "monitor_id")
    private List<Computer> computers;

    public Monitor() {
    }

    public Monitor(String name, String description, double price, MonitorType monitorType, Manufacturer manufacturer, double width) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.monitorType = monitorType;
        this.manufacturer = manufacturer;
        this.width = width;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }

    public MonitorType getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(MonitorType monitorType) {
        this.monitorType = monitorType;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
