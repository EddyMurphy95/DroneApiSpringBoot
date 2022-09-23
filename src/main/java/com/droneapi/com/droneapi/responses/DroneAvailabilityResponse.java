package com.droneapi.com.droneapi.responses;

import java.time.LocalDateTime;
import java.util.List;

import com.droneapi.com.droneapi.model.Drone;

public class DroneAvailabilityResponse {

    private String status;
    private String message;
    private LocalDateTime time;
    private List<Drone> drones;

    public DroneAvailabilityResponse() {
    }

    public DroneAvailabilityResponse(String status, String message, LocalDateTime time, List<Drone> drones2) {
        super();
        this.status = status;
        this.message = message;
        this.time = time;
        this.drones = drones2;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTime() {
        return this.time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public List<Drone> getDrones() {
        return this.drones;
    }

    public void setDrones(List<Drone> drones) {
        this.drones = drones;
    }

    @Override
    public String toString() {
        return "{" +
                " status='" + getStatus() + "'" +
                ", message='" + getMessage() + "'" +
                ", time='" + getTime() + "'" +
                ", drones='" + getDrones() + "'" +
                "}";
    }

}
