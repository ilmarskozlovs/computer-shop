package com.mycompany.computershop.model.parts;

import javax.persistence.*;
import java.util.List;

@Entity
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String country;

    private String description;

    @OneToMany
    @JoinColumn
    private List<Cpu> cpuList;

    @OneToMany
    @JoinColumn
    private List<Monitor> monitors;

    @OneToMany
    @JoinColumn
    private List<MotherBoard> motherBoards;

    @OneToMany
    @JoinColumn
    private List<Ram> rams;

    public Manufacturer() {
    }

    public Manufacturer(String name, String country, String description) {
        this.name = name;
        this.country = country;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
