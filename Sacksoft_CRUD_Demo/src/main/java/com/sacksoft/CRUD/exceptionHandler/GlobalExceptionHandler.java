package com.sacksoft.CRUD.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(InsufficientDataException.class)
	public ResponseEntity<InsufficientDataException> handleInsufficientdataException(InsufficientDataException e,WebRequest request){
		return new ResponseEntity<InsufficientDataException>(e, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(PersonNotFoundException.class)
	public ResponseEntity<PersonNotFoundException> handlePersonNotFoundException(PersonNotFoundException e,WebRequest request){
		return new ResponseEntity<PersonNotFoundException>(e, HttpStatus.NOT_FOUND);
	}

}
