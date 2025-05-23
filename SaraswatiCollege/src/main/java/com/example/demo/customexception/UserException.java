package com.example.demo.customexception;

public class UserException extends RuntimeException{
	
	private String message;

	public UserException(String message) {
		super();
		this.message = message;
	}

	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	

}
