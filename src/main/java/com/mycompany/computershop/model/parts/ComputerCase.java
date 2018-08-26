package com.mycompany.computershop.model.parts;

import com.mycompany.computershop.model.Computer;

import javax.persistence.*;
import java.util.List;

@Entity
public class ComputerCase {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;

    private double price;

    @ManyToOne
    private CaseType caseType;

    private double weight;

    @OneToMany
    @JoinColumn
    private List<Computer> computers;

    public ComputerCase() {
    }

    public ComputerCase(String name, String description, double price, CaseType caseType, double weight) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.caseType = caseType;
        this.weight = weight;
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

    public CaseType getCaseType() {
        return caseType;
    }

    public void setCaseType(CaseType caseType) {
        this.caseType = caseType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }
}
