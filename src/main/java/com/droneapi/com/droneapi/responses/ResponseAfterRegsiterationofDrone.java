package com.droneapi.com.droneapi.responses;

import java.time.LocalDateTime;

public class ResponseAfterRegsiterationofDrone {

    private String serialNumber;
    private String message;
    private String result;
    private LocalDateTime timestamp;

    public ResponseAfterRegsiterationofDrone(String serialNumber, String message, String result,
            LocalDateTime timestamp) {
        this.serialNumber = serialNumber;
        this.message = message;
        this.result = result;
        this.timestamp = timestamp;
    }

    public ResponseAfterRegsiterationofDrone() {

    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "{" +
                " serialNumber='" + getSerialNumber() + "'" +
                ", message='" + getMessage() + "'" +
                ", result='" + getResult() + "'" +
                ", timestamp='" + getTimestamp() + "'" +
                "}";
    }

}
