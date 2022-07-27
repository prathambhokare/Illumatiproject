package com.psl.lmsserver.factory;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.psl.lmsserver.exceptions.ExceptionResponse;
import com.psl.lmsserver.filter.generic.Response;



public class ApplicationFactory {

	private ApplicationFactory() {
		super();
	}
	
	private static class ApplicationFactoryWrapper {
		public static final ApplicationFactory INSTANCE = new ApplicationFactory();
	}
	
	public static ApplicationFactory getInstance() {
		return ApplicationFactoryWrapper.INSTANCE;
	}
	
	public ObjectMapper getObjectMapper() {
		return new ObjectMapper();
	}
	
	public Response<Object> createResponse(String message, HttpStatus status){
		return new Response<>(message,status.name(),status.value());
	}
	
	public Response<Object> createResponse(String message, HttpStatus status, Object data){
		return new Response<>(message,status.name(),status.value(),data);
	}
	
	public ExceptionResponse createExceptionResponse(String errorMessage, HttpStatus status) {
		return new ExceptionResponse(errorMessage, status.name(), status.value());
	}

}