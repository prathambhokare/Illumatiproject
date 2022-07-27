package com.psl.lmsserver.exceptions;

public class TokenTimeOutException extends Exception {

	private static final long serialVersionUID = -6674811779739740567L;

	public TokenTimeOutException(String message) {
		super(message);
	}
}
