package com.mycompany.computershop.model.parts;

import com.mycompany.computershop.model.Computer;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vga {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;

    private double price;

    @ManyToOne
    private Manufacturer manufacturer;

    private int frequency;

    @ManyToOne
    private MemorySize memorySize;

    @OneToMany
    @JoinColumn(name = "vga_id")
    private List<Computer> computers;

    public Vga() {
    }

    public Vga(String name, String description, double price, Manufacturer manufacturer, int frequency, MemorySize memorySize) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.manufacturer = manufacturer;
        this.frequency = frequency;
        this.memorySize = memorySize;
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

    public MemorySize getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(MemorySize memorySize) {
        this.memorySize = memorySize;
    }
}
