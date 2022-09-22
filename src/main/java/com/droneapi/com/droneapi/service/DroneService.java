package com.droneapi.com.droneapi.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.droneapi.com.droneapi.model.Drone;
import com.droneapi.com.droneapi.repository.DroneRepository;
import com.droneapi.com.droneapi.responses.ResponseAfterRegsiterationofDrone;

@Service
public class DroneService {

    // injecting repositories
    @Autowired
    private DroneRepository dronerepo;

    // first function of the service is for the API to register a drone
    public ResponseAfterRegsiterationofDrone registerDrone(Drone droneRequest) {
        Drone mydrone = new Drone();
        mydrone.setSerialNumber(droneRequest.getSerialNumber());
        mydrone.setModel(droneRequest.getModel());
        mydrone.setWeight(droneRequest.getWeight());
        mydrone.setBatteryCapacity(droneRequest.getBatteryCapacity());
        mydrone.setState(droneRequest.getState());

        // save drone into database
        dronerepo.save(mydrone);

        // Get a response
        ResponseAfterRegsiterationofDrone registerResponse = new ResponseAfterRegsiterationofDrone();

        registerResponse.setSerialNumber(mydrone.getSerialNumber());
        registerResponse.setMessage("Drone Successfully Registered");
        registerResponse.setResult("success");
        registerResponse.setTimestamp(LocalDateTime.now());

        return registerResponse;

    }

}
