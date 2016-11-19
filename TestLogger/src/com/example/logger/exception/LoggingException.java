package com.example.logger.exception;

@SuppressWarnings("serial")
public class LoggingException extends RuntimeException{

	public LoggingException(Exception exc) {
		super(exc);
	}
}
