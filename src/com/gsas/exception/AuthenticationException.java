package com.gsas.exception;

public class AuthenticationException extends Exception {

	public AuthenticationException() {
		super("Authentication Failed.");
	}

	public AuthenticationException(String message) {
		super(message);
	}

}
