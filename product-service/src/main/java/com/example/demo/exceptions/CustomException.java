package com.example.demo.exceptions;



public class CustomException  extends RuntimeException{

	private static final long serialVersionUID = 1L;
private String errorMessage;


public CustomException(String errorMessage) {
	super(errorMessage);
	this.errorMessage=errorMessage;
}

@Override
public String getMessage() {
	return this.errorMessage;
}
}

