package com.chainsys.classesmethods;
/**
 * 
 * @author omku3118
 * Created on 25 March 2022
 */
public class Movies {

	private String moviename;
	private String theatreName;
	private int movieReleaseDate;
	private int ticketPrice;
	private int tickeNo;
	
	public Movies (String movname)
	{
		this.moviename=movname;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public int getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(int movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getTickeNo() {
		return tickeNo;
	}

	public void setTickeNo(int tickeNo) {
		this.tickeNo = tickeNo;
	}
	
}
