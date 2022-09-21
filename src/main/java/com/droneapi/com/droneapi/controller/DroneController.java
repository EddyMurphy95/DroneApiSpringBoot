package com.droneapi.com.droneapi.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.droneapi.com.droneapi.model.Drone;
import com.droneapi.com.droneapi.repository.DroneRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/drone") // base url endpoint
public class DroneController {

    @Autowired
    private DroneRepository droneRepository;

    // create an employee rest api
    @PostMapping("/register")
    public ResponseEntity<Map<String, Boolean>> createDrone(@Valid @RequestBody Drone drone) {
        Map<String, Boolean> response = new HashMap<>();
        Drone mydrone = droneRepository.save(drone);
        if (mydrone != null) {
            response.put("Drone Successfully Registered!", Boolean.TRUE);
        }
        return ResponseEntity.ok(response);
    }
}
