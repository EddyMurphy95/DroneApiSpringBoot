package com.droneapi.com.droneapi.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "load-drone")
public class LoadDroneWithMedication {

    @JoinColumn(name = "fkey-serial-number", referencedColumnName = "serial-number")
    @OneToOne(cascade = CascadeType.ALL)
    private Drone drone;

    @JoinColumn(name = "fkey-code", referencedColumnName = "code", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Medication medication;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tracking-id")
    private Integer Id;

    @Column(columnDefinition = "VARCHAR(30) NOT NULL")
    private String source;

    @Column(columnDefinition = "VARCHAR(30) NOT NULL")
    private String destination;

    @Column(columnDefinition = "VARCHAR(25) NOT NULL")
    private LocalDateTime dateLoaded;

    public LoadDroneWithMedication(Drone drone, Medication medication, Integer Id, String source, String destination,
            LocalDateTime dateLoaded) {
        this.drone = drone;
        this.medication = medication;
        this.Id = Id;
        this.source = source;
        this.destination = destination;
        this.dateLoaded = dateLoaded;
    }

    public LoadDroneWithMedication() {
    }

    public Drone getDrone() {
        return this.drone;
    }

    public void setDrone(Drone drone) {
        this.drone = drone;
    }

    public Medication getMedication() {
        return this.medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDateLoaded() {
        return this.dateLoaded;
    }

    public void setDateLoaded(LocalDateTime dateLoaded) {
        this.dateLoaded = dateLoaded;
    }

}
