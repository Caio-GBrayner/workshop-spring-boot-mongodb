package com.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long timeStamp;
	private Integer Status;
	private String error;
	private String message;
	private String path;
	
	public StandardError() {
	}

	public StandardError(long timeStamp, Integer status, String error, String message, String path) {
		super();
		this.timeStamp = timeStamp;
		Status = status;
		this.error = error;
		this.message = message;
		this.path = path;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer status) {
		Status = status;
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
