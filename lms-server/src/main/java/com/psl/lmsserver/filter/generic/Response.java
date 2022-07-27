package com.psl.lmsserver.filter.generic;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {

	private String message;
	private String status;
	private int statusCode;
	private T content;

	public Response() {
		super();
	}
	public Response(String message) {
		super();
		this.message = message;
	}
	public Response(String message, String status, int statusCode, T data) {
		this.message = message;
		this.status = status;
		this.statusCode = statusCode;
		this.content = data;
	}
	
	public Response(String message, String status, int statusCode) {
		this.message = message;
		this.status = status;
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
}