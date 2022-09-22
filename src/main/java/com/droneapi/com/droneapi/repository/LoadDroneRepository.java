package com.droneapi.com.droneapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.droneapi.com.droneapi.model.LoadDroneWithMedication;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface LoadDroneRepository extends JpaRepository<LoadDroneWithMedication, String> {

}
