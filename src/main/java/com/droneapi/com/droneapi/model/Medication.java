package com.droneapi.com.droneapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medication")
public class Medication {

    @Id
    @Column(name = "code", columnDefinition = "VARCHAR(20) ")
    private String code;

    @Column(name = "name", columnDefinition = "VARCHAR(30)")
    private String name;

    @Column(name = "weight", columnDefinition = "VARCHAR(20)")
    private double weight;

    private String image;

    public Medication() {
    }

    public Medication(String code, String name, double weight, String image) {
        this.code = code;
        this.name = name;
        this.weight = weight;
        this.image = image;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Medication code(String code) {
        setCode(code);
        return this;
    }

    public Medication name(String name) {
        setName(name);
        return this;
    }

    public Medication weight(double weight) {
        setWeight(weight);
        return this;
    }

    public Medication image(String image) {
        setImage(image);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " code='" + getCode() + "'" +
                ", name='" + getName() + "'" +
                ", weight='" + getWeight() + "'" +
                ", image='" + getImage() + "'" +
                "}";
    }

}
