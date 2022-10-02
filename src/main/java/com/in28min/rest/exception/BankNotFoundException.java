package com.in28min.rest.exception;

public class BankNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BankNotFoundException(String message) {
		super(message);
	}
}
