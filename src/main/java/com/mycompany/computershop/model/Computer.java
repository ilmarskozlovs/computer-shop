package com.mycompany.computershop.model;

import com.mycompany.computershop.model.parts.*;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Computer {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ManyToOne
    private ComputerType computerType;

    @ManyToOne
    private Cpu cpu;

    @ManyToOne
    private MotherBoard motherBoard;

    @ManyToOne
    private Vga vga;

    @ManyToOne
    private Hdd hdd;

    @ManyToOne
    private Ram ram;

    @ManyToOne
    private PowerBlock powerBlock;

    @ManyToOne
    private Monitor monitor;

    @ManyToOne
    private ComputerCase computerCase;

    public Computer() {
    }

    public Computer(String name, ComputerType computerType, Cpu cpu,
                    MotherBoard motherBoard, Vga vga, Hdd hdd, Ram ram,
                    PowerBlock powerBlock, Monitor monitor, ComputerCase computerCase) {
        this.name = name;
        this.computerType = computerType;
        this.cpu = cpu;
        this.motherBoard = motherBoard;
        this.vga = vga;
        this.hdd = hdd;
        this.ram = ram;
        this.powerBlock = powerBlock;
        this.monitor = monitor;
        this.computerCase = computerCase;
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

    public ComputerType getComputerType() {
        return computerType;
    }

    public void setComputerType(ComputerType computerType) {
        this.computerType = computerType;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Vga getVga() {
        return vga;
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public PowerBlock getPowerBlock() {
        return powerBlock;
    }

    public void setPowerBlock(PowerBlock powerBlock) {
        this.powerBlock = powerBlock;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }
}
