package com.accenture.lkm.oop.exceptions;

public class AgeException extends RuntimeException {
	public String ageExceptionMessage() {
		return "age should not be zero!!";
	}
}
