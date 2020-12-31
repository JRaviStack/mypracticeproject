package com.accenture.lkm.oop.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo6 {

	public static void main(String[] args) {
		int personAge = Demo6.readAge();
		if(personAge>18) {
			System.out.println("Person is eligible to vote!!");
		} else {
			System.out.println("Person is not eligible ot vote!!");
		}
	}
	
	public static int readAge() {
		int age = 0;
		try {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Enter the age of the person");
		age = Integer.parseInt(br.readLine());
		if(age == 0) {
			throw new AgeException();
		}
		} catch(NumberFormatException nfe) {
			System.out.println("please enter integer, "+nfe.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} catch(AgeException ae) {
			ae.ageExceptionMessage();
		}
		return age;
	}

}
