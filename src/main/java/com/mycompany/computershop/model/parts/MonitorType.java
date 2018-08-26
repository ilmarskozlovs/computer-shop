package com.mycompany.computershop.model.parts;

import javax.persistence.*;
import java.util.List;

@Entity
public class MonitorType {

    @Id
    @GeneratedValue
    private int id;

    private String type;

    @OneToMany
    @JoinColumn
    private List<Monitor> monitors;

    public MonitorType() {
    }

    public MonitorType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
