package com.psl.lmsserver.exceptions;

public class InvalidCredentialsException extends Exception {

	private static final long serialVersionUID = 8023327305867654586L;

	public InvalidCredentialsException(String message) {
		super(message);
	}
}
