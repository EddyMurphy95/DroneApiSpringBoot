package com.droneapi.com.droneapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "medication")
public class Medication {

    @Id
    @NotEmpty(message = "Code Required!")
    @Pattern(regexp = "^[0-9A-Z_-]*$")
    private String code;
    @Column(columnDefinition = "VARCHAR(16) NOT NULL")
    @Pattern(regexp = "^[0-9A-Z_-]*$")
    private String name;
    @Column(columnDefinition = "VARCHAR(16) NOT NULL")
    private double weight;
    @Column(columnDefinition = "VARCHAR(30) NOT NULL")
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
