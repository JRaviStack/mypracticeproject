package com.accenture.lkm.oop;

public class GarbageCollectorDemo {

	public static void main(String[] args) {
		int testNum = 0; // memory leak
		// testNum= null;//

		Movie movie = new Movie();
		// System.out.println(movie);
		Movie movie1 = movie;
		System.out.println(movie);
		System.out.println(movie1);
		movie = null;
		System.out.println(movie);
		System.out.println(movie1);
		/*
		 * movie = null; // movie is eligible for GC System.out.println(movie);
		 */
      //System.gc();

	}

}
