package com.sts.curse.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Instant timestamp;
	private Integer stgatus;
	private String error;
	private String message;
	private String path;
	
	public StandardError() {
	}

	public StandardError(Instant timestamp, Integer stgatus, String error, String message, String path) {
		this.timestamp = timestamp;
		this.stgatus = stgatus;
		this.error = error;
		this.message = message;
		this.path = path;
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStgatus() {
		return stgatus;
	}

	public void setStgatus(Integer stgatus) {
		this.stgatus = stgatus;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
