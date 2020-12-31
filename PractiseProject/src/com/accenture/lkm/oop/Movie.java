package com.accenture.lkm.oop;

public class Movie {
	//instance variables
	private int movieId;
	private String movieName;
	private String userName;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String displayGreetMessage(String message) {
		return message;
	}
	
	
	

}
