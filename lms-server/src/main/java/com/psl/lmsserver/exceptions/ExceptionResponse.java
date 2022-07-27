package com.psl.lmsserver.exceptions;

public class ExceptionResponse {
	
	private String message;
	private String status;
	private int statusCode;
	
	public ExceptionResponse(String message, String status, int statusCode) {
		super();
		this.message = message;
		this.status = status;
		this.statusCode = statusCode;
	}
	
	public ExceptionResponse(String message) {
		this.message = message;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
}
