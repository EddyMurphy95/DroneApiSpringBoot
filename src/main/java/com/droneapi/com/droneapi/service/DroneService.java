package com.droneapi.com.droneapi.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.droneapi.com.droneapi.model.Drone;
import com.droneapi.com.droneapi.repository.DroneRepository;
import com.droneapi.com.droneapi.responses.DroneAvailabilityResponse;
import com.droneapi.com.droneapi.responses.ResponseAfterRegsiterationofDrone;

@Service
public class DroneService {

    // injecting repositories
    @Autowired
    private DroneRepository dronerepo;

    // first function of the service is for the API to register a drone
    public ResponseAfterRegsiterationofDrone registerDrone(Drone droneRequest) {

        // Get a response
        ResponseAfterRegsiterationofDrone registerResponse = new ResponseAfterRegsiterationofDrone();

        Drone mydrone = new Drone();
        mydrone.setSerialNumber(droneRequest.getSerialNumber());
        mydrone.setModel(droneRequest.getModel());
        mydrone.setWeight(droneRequest.getWeight());
        mydrone.setBatteryCapacity(droneRequest.getBatteryCapacity());
        mydrone.setState(droneRequest.getState());

        // check for existence
        boolean exist = dronerepo.existsById(droneRequest.getSerialNumber());

        if (exist) {
            registerResponse.setSerialNumber(mydrone.getSerialNumber());
            registerResponse.setMessage("Drone With Serial Number " + mydrone.getSerialNumber() + " Already Exists");
            registerResponse.setResult("Failed");
            registerResponse.setTimestamp(LocalDateTime.now());

            return registerResponse;
        }

        // save drone into database
        dronerepo.save(mydrone);

        registerResponse.setSerialNumber(mydrone.getSerialNumber());
        registerResponse.setMessage("Drone Successfully Registered");
        registerResponse.setResult("success");
        registerResponse.setTimestamp(LocalDateTime.now());

        return registerResponse;

    }

    public DroneAvailabilityResponse getavailableDrones() {
        String state = "IDLE";
        List<Drone> drones = dronerepo.findAllByState(state);
        if (drones.size() == 0) {

            return new DroneAvailabilityResponse("Failed", "No Idle Drones Found", LocalDateTime.now(), drones);
        }
        return new DroneAvailabilityResponse("Success", "Drone Successfully Retrieved", LocalDateTime.now(), drones);

    }

}
