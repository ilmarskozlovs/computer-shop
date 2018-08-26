package com.mycompany.computershop.model.parts;

import com.mycompany.computershop.model.Computer;

import javax.persistence.*;
import java.util.List;

@Entity
public class MotherBoard {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;

    private double price;

    @ManyToOne
    private Manufacturer manufacturer;

    private int mainMemory;

    @OneToMany
    @JoinColumn(name = "motherboard_id")
    private List<Computer> computers;

    public MotherBoard() {
    }

    public MotherBoard(String name, String description, double price, Manufacturer manufacturer, int mainMemory) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.manufacturer = manufacturer;
        this.mainMemory = mainMemory;
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

    public int getMainMemory() {
        return mainMemory;
    }

    public void setMainMemory(int mainMemory) {
        this.mainMemory = mainMemory;
    }
}
