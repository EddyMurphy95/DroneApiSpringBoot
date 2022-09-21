package com.droneapi.com.droneapi.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Drone {

    @Id
    @NotNull(message = "Serial Number Required!")
    @Column(name = "serial-number")
    private String serialNumber;
    @NotNull(message = "Model is Required!")
    @Column(name = "model")
    private String model;
    @NotNull(message = "Weight is Required!")
    @Max(value = 500, message = "Weight should not exceed 500 grams")
    @Column(name = "weight")
    private BigInteger weight;// weight limit 500grams max
    @NotNull(message = "battery Capacity Number Required!")
    @Column(name = "battery-capacity", precision = 3, scale = 2)
    private BigDecimal batteryCapacity;
    @Column(name = "state")
    @NotNull(message = "state Required!")
    private String state; // (IDLE, LOADING, LOADED, DELIVERING, DELIVERED, RETURNING)

    public Drone() {

    }

    public Drone(String serialNumber, String model, BigInteger weight, BigDecimal batteryCapacity, String state) {
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

    public BigDecimal getBatteryCapacity() {
        return this.batteryCapacity;
    }

    public void setBatteryCapacity(BigDecimal batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
