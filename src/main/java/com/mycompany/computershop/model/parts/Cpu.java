package com.mycompany.computershop.model.parts;

import com.mycompany.computershop.model.Computer;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cpu {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ManyToOne
    private Manufacturer manufacturer;

    private double price;

    private int frequency;

    private int numberOfCores;

    private String description;

    @OneToMany
    @JoinColumn(name = "cpu_id")
    private List<Computer> computers;

    public Cpu() {
    }

    public Cpu(String name, Manufacturer manufacturer, double price, int frequency, int numberOfCores, String description) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.description = description;
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

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }
}
