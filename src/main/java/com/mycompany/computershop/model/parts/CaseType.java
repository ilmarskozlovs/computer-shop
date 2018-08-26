package com.mycompany.computershop.model.parts;

import javax.persistence.*;
import java.util.List;

@Entity
public class CaseType {

    @Id
    @GeneratedValue
    private int id;

    private String title;

    @OneToMany
    @JoinColumn
    private List<ComputerCase> computerCase;

    public CaseType() {
    }

    public CaseType(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ComputerCase> getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(List<ComputerCase> computerCase) {
        this.computerCase = computerCase;
    }
}
