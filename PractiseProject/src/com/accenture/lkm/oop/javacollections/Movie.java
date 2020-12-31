package com.accenture.lkm.oop.javacollections;

public class Movie implements Comparable {
	
	private int movieId;
	private String movieName;
	private int rating;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + movieId;
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + rating;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (movieId != other.movieId)
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}

	Movie(){
	}
	
	public Movie(int movieId, String movieName, int rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
	}
	public int getMovieId() {
		return movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public int getRating() {
		return rating;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Object anotherMovieObj) {
		return this.getMovieName().compareTo(((Movie) anotherMovieObj).getMovieName());
	}
	
}
