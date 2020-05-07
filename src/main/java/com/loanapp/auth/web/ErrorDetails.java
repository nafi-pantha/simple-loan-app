package com.loanapp.auth.web;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ErrorDetails {
	private HttpStatus code;
	private String message;
	
	public ErrorDetails() {
	}

	public ErrorDetails(HttpStatus code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public HttpStatus getCode() {
		return code;
	}

	public void setCode(HttpStatus code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
		
}
