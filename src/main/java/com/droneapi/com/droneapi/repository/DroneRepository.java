package com.droneapi.com.droneapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.droneapi.com.droneapi.model.Drone;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface DroneRepository extends JpaRepository<Drone, String> {

    // Checks available drones with state = IDLE
    List<Drone> findAllByState(@Param("state") String state); // using method
}
