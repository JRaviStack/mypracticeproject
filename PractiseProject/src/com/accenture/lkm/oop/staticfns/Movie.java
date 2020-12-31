package com.accenture.lkm.oop.staticfns;

public class Movie {
	//int movieObjectCount = 0; //instance variables - behaviour - every time a new copy will be created
	static int movieObjectCount; //static variable, class variables
	int mobilePickedDuringMovie;
	
	static {
		System.out.println("static block2 invoked!!");
	}
	
	static {
		System.out.println("static block1 invoked!!");
		movieObjectCount = 0; //intialization
	}
		
	static {
		System.out.println("static block3 invoked!!");
	}
	
	public Movie() {
		System.out.println("Movie constructor invoked!!");
		movieObjectCount++; //post increment
	}
	
	public String greetUser(String userName) { //instance method
		return  "Hi, "+userName;
	}
	
	public static String snackTime(int popcornTubs, int softdrinks) { //static method
		return  "Your ordered "+popcornTubs+", "+softdrinks;
	}
	
	// instance variables cannot be used in static methods
	// uncomment line no 28 to 30 - observe the error
	/*
	 * public static int getCountMobilePickedDuringMovie() { return
	 * mobilePickedDuringMovie++; }
	 */
	

}
