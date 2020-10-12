package com.gsas.exception;

public class SchemeNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SchemeNotFoundException() {
		super("Scheme not found");
		
	}

	public SchemeNotFoundException(String arg0) {
		super(arg0);
		
	}
	

}
