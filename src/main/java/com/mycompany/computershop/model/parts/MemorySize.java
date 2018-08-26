package com.mycompany.computershop.model.parts;

import javax.persistence.*;
import java.util.List;

@Entity
public class MemorySize {

    @Id
    @GeneratedValue
    private int id;

    private int size;

    @OneToMany
    @JoinColumn
    private List<Ram> ramList;

    public MemorySize() {
    }

    public MemorySize(int size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
