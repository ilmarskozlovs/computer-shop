package com.mycompany.computershop.model.parts;

import com.mycompany.computershop.model.Computer;

import javax.persistence.*;
import java.util.List;

@Entity
public class PowerBlock {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;

    private double price;

    private int power;

    private double diameter;

    @OneToMany
    @JoinColumn(name = "powerblock_id")
    private List<Computer> computers;

    public PowerBlock() {
    }

    public PowerBlock(String name, String description, double price, int power, double diameter) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.power = power;
        this.diameter = diameter;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
