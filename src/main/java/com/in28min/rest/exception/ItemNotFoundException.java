package com.in28min.rest.exception;

public class ItemNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ItemNotFoundException(String message) {
		super(message);
	}
}
