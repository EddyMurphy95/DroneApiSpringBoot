package com.droneapi.com.droneapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.droneapi.com.droneapi.model.Drone;

@Repository
public interface DroneRepository extends JpaRepository<Drone, String> {

}
