package com.loanapp.auth.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javassist.NotFoundException;

@ControllerAdvice
public class CustomErrorHandler {
	
	@Autowired
	private ErrorDetails error;
	
	@ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorDetails> handleNotFound(NotFoundException nfe) {
        error.setCode(HttpStatus.NOT_FOUND);
        error.setMessage("ID not found OR Your custom message or e.getMessage()");
        return new ResponseEntity<ErrorDetails>(error, HttpStatus.NOT_FOUND);
    }
}
