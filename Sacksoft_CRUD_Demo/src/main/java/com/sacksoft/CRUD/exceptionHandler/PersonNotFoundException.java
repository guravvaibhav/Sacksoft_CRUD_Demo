package com.sacksoft.CRUD.exceptionHandler;


public class PersonNotFoundException extends RuntimeException{

	public PersonNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PersonNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PersonNotFoundException";
	}
	
	
	
}
