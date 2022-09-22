package com.droneapi.com.droneapi.responses;

import java.time.LocalDateTime;

public class LoadDroneWithMedicationResponse {

    private String serialNumber;
    private String medicationCode;
    private String message;
    private String result;
    private LocalDateTime timestamp;

    public LoadDroneWithMedicationResponse(String serialNumber, String medicationCode, String message, String result,
            LocalDateTime timestamp) {

        this.serialNumber = serialNumber;
        this.medicationCode = medicationCode;
        this.message = message;
        this.result = result;
        this.timestamp = timestamp;
    }

    public LoadDroneWithMedicationResponse() {
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMedicationCode() {
        return this.medicationCode;
    }

    public void setMedicationCode(String medicationCode) {
        this.medicationCode = medicationCode;
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
                ", medicationCode='" + getMedicationCode() + "'" +
                ", message='" + getMessage() + "'" +
                ", result='" + getResult() + "'" +
                ", timestamp='" + getTimestamp() + "'" +
                "}";
    }
}
