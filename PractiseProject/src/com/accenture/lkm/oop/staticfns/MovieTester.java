package com.accenture.lkm.oop.staticfns;

public class MovieTester {

	public static void main(String[] args) {
		
		Movie movie1 = new Movie();
		System.out.println(Movie.movieObjectCount); // 1 - static way
		System.out.println(movie1.greetUser("Bhavya"));
		System.out.println(Movie.snackTime(1, 1)); //static way
		
		Movie movie2 = new Movie();
		System.out.println(Movie.movieObjectCount); // 2
		System.out.println(movie2.greetUser("Abhishek"));
		System.out.println(Movie.snackTime(2, 1)); //static way

	}

}
