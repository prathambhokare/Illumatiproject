package com.psl.lmsserver.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.psl.lmsserver.factory.ApplicationFactory;


@ControllerAdvice
public class GlobalExceptionHandler {
	
	private final Logger logger= LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleResourceNotFoundException(final ResourceNotFoundException e) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		logger.error("GlobalExceptionHandler.handleResourceNotFoundException :", e);
		return handleErrors(e.getMessage(), status);
	}

	@ExceptionHandler(KeysNotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleKeysNotFoundException(final KeysNotFoundException e) {
		HttpStatus status = HttpStatus.BAD_REQUEST;
		logger.error("GlobalExceptionHandler.handleKeysNotFoundException :", e);
		return handleErrors(e.getMessage(), status);
	}
	

	@ExceptionHandler(RequestDataException.class)
	public ResponseEntity<ExceptionResponse> handleRequestDataException(final RequestDataException e) {
		HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;
		logger.error("GlobalExceptionHandler.handleRequestDataException :", e);
		return handleErrors(e.getMessage(), status);
	}

	
	@ExceptionHandler(InvalidInputException.class)
	public ResponseEntity<?> handleInvalidInputException(final InvalidInputException e) {
		HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;
		logger.error("GlobalExceptionHandler.handleInvalidInputException :",e);
		return handleErrors(e.getMessage(), status);
	}
	
	@ExceptionHandler(InputNotAcceptableException.class)
	public ResponseEntity<ExceptionResponse> handleInputNotAcceptableException(final InputNotAcceptableException e) {
		HttpStatus status = HttpStatus.CONFLICT;
		logger.error("GlobalExceptionHandler.handleInputNotAcceptableException :", e);
		return handleErrors(e.getMessage(), status);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponse> handleException(final Exception e) {
		HttpStatus status = HttpStatus.CONFLICT;
		logger.error("GlobalExceptionHandler.handleException :", e);
		return handleErrors(env.getProperty("unexpected.error"), status);
	}
	
	@ExceptionHandler(InvalidCredentialsException.class)
	public ResponseEntity<ExceptionResponse> handleInvalidCredentialsException(final InvalidCredentialsException e) {
		HttpStatus status = HttpStatus.UNAUTHORIZED;
		logger.error("GlobalExceptionHandler.handleInvalidCredentialsException :", e);
		return handleErrors(e.getMessage(), status);
	}
	
	@ExceptionHandler(TokenTimeOutException.class)
	public ResponseEntity<ExceptionResponse> handleTokenTimeOutException(final TokenTimeOutException e) {
		HttpStatus status = HttpStatus.EXPECTATION_FAILED;
		logger.error("GlobalExceptionHandler.handleRequestDataException :", e);
		return handleErrors(e.getMessage(), status);
	}

	public ResponseEntity<ExceptionResponse> handleErrors(String errorMessage, HttpStatus status) {
		return new ResponseEntity<ExceptionResponse>(ApplicationFactory.getInstance().createExceptionResponse(errorMessage, status), status);
	}
}