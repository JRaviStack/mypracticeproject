package com.accenture.lkm.oop.javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieTester {
	// obj1.compareTo(obj2) - Comparable
	//compare(obj1, obj2) - Comparator
	public static void main(String[] args) {
		
		List<Movie> movies = new ArrayList<Movie>();
		
		Movie movie1 = new Movie(1001,"B..Hello",3);
		Movie movie2 = new Movie(1002,"C..Java..the ocean",5);
		Movie movie3 = new Movie(1003,"A..yourwish",4);
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		/*
		 * System.out.println("===With out sorting==="); System.out.println(movies);
		 * Collections.sort(movies); System.out.println("===sorting - comparable===");
		 * System.out.println(movies);
		 */
		Collections.sort(movies, new MovieByRating());
		System.out.println("===sorting - comparator===");
		System.out.println(movies);
		/*
		 * Collections.reverse(movies);
		 * System.out.println("===sorting -descending - comparator===");
		 * System.out.println(movies);
		 */
	}

}
