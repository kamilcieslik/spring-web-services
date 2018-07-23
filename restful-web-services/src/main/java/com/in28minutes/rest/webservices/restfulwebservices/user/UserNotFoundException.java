package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;

import java.util.Optional;

public class  UserNotFoundException extends RuntimeException {
	private HttpStatus httpStatus;

	public UserNotFoundException(String message) {
		super(message);
	}

	public UserNotFoundException(String s, HttpStatus accepted) {
		super(s);
		httpStatus = accepted;
	}

	public Optional<HttpStatus> getHttpStatus() {
		return Optional.ofNullable(httpStatus);
	}
}
