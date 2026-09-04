package com.ExecptionHandling;
public class InputMissMatchException extends Exception{
	String message;
	public InputMissMatchException(String message) {
		super(message);
	}
}


