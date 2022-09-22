package com.droneapi.com.droneapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.droneapi.com.droneapi.model.Drone;
import com.droneapi.com.droneapi.responses.ResponseAfterRegsiterationofDrone;
import com.droneapi.com.droneapi.service.DroneService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/drone") // base url endpoint
public class DroneController {

    // injecting services
    @Autowired
    private DroneService droneService;

    // create an employee rest api
    @PostMapping("/register")
    public ResponseEntity<ResponseAfterRegsiterationofDrone> registerDrone(
            @Valid @RequestBody Drone dronerequest) {
        ResponseAfterRegsiterationofDrone newDrone = droneService.registerDrone(dronerequest);
        return new ResponseEntity<ResponseAfterRegsiterationofDrone>(newDrone, HttpStatus.CREATED);
    }
}
