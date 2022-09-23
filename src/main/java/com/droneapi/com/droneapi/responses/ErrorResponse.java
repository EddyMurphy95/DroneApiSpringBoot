package com.droneapi.com.droneapi.responses;

import java.time.LocalDateTime;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import jakarta.persistence.EntityListeners;

@EntityListeners(AuditingEntityListener.class)
public class ErrorResponse {

	public ErrorResponse(String result, String message, LocalDateTime timestamp) {
		super();
		this.result = result;
		this.message = message;
		this.timestamp = timestamp;
	}

	public ErrorResponse() {

	}

	private String result;
	private String message;
	private LocalDateTime timestamp;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

}
