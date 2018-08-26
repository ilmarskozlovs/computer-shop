package com.mycompany.computershop.model.parts;

import com.mycompany.computershop.model.Computer;

import javax.persistence.*;
import java.util.List;

@Entity
public class Hdd {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private double price;

    private String description;

    private int capacity;

    @OneToMany
    @JoinColumn(name = "hdd_id")
    private List<Computer> computers;

    public Hdd() {
    }

    public Hdd(String name, String description, double price, int capacity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.capacity = capacity;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
