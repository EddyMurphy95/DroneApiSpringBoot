package com.droneapi.com.droneapi.model;

import java.math.BigInteger;
import java.text.DecimalFormat;

import jakarta.persistence.*;

@Entity
public class Drone {

    @Id
    @Column(columnDefinition = "VARCHAR(100) NOT NULL")
    private String serialNumber;
    private String model;
    @Column(name = "weight-limit", columnDefinition = "VARCHAR(5) NOT NULL")
    private BigInteger weight;
    @Column(name = "battery-capacity", columnDefinition = "VARCHAR(5) NOT NULL")
    private DecimalFormat batteryCapacity;
    private String state;

    public Drone() {
    }

    public Drone(String serialNumber, String model, BigInteger weight, DecimalFormat batteryCapacity, String state) {
        super();
        this.serialNumber = serialNumber;
        this.model = model;
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
        this.state = state;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigInteger getWeight() {
        return this.weight;
    }

    public void setWeight(BigInteger weight) {
        this.weight = weight;
    }

    public DecimalFormat getBatteryCapacity() {
        return this.batteryCapacity;
    }

    public void setBatteryCapacity(DecimalFormat batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Drone serialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    public Drone model(String model) {
        setModel(model);
        return this;
    }

    public Drone weight(BigInteger weight) {
        setWeight(weight);
        return this;
    }

    public Drone batteryCapacity(DecimalFormat batteryCapacity) {
        setBatteryCapacity(batteryCapacity);
        return this;
    }

    public Drone state(String state) {
        setState(state);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " serialNumber='" + getSerialNumber() + "'" +
                ", model='" + getModel() + "'" +
                ", weight='" + getWeight() + "'" +
                ", batteryCapacity='" + getBatteryCapacity() + "'" +
                ", state='" + getState() + "'" +
                "}";
    }

}
