package com.accenture.lkm.oop.exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo6CustomException {
	
	public static int doReadAge() throws IOException,NumberFormatException,DemoAgeException {
		int personAge;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your age");
		personAge = Integer.parseInt(br.readLine());
		if(personAge <0 || personAge > 200) {
				throw new DemoAgeException();
		}
		return personAge;
	}

	public static void main(String[] args) {
		try {
			int age = doReadAge();
			System.out.println(age);
		}catch (IOException | NumberFormatException| DemoAgeException e) {
			DemoAgeException.personAgeException();
			e.printStackTrace();
		}
		
	}

}