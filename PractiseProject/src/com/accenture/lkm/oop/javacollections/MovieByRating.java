package com.accenture.lkm.oop.javacollections;

import java.util.Comparator;

public class MovieByRating implements Comparator<Movie> {

	@Override
	public int compare(Movie movieObj1, Movie movieObj2) {
		if(movieObj1.getRating() == movieObj2.getRating())
		return 0;
		else if(movieObj1.getRating()< movieObj2.getRating())
		return -1;
		else
		return 1;	
	}

}
