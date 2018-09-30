package com.kata.exception;

public class IllegalStatementException extends Exception {

	private String message;

	public IllegalStatementException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
