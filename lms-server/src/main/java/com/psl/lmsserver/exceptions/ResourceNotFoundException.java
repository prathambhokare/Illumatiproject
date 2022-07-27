package com.psl.lmsserver.exceptions;

public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = -7833737983165068888L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
