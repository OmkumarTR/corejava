package com.chainsys.unit.test;
import com.chainsys.classesmethods.Movies;

public class MovieTester {

	public static void testMovie()
	{
		Movies firstMovie= new Movies("rrr");
		firstMovie.setMoviename("RRR");
		firstMovie.setMovieReleaseDate(2022);
		firstMovie.setTheatreName("INOX");
		firstMovie.setTickeNo(2);
		firstMovie.setTicketPrice(120);
		
		System.out.println("Movie Name is         :" +firstMovie.getMoviename());
		System.out.println("Movie Release date is :"+firstMovie.getMovieReleaseDate());
		System.out.println("Theatre name is       :"+firstMovie.getTheatreName());
		System.out.println("Ticket No is          :" +firstMovie.getTickeNo());
		System.out.println(" Ticket price is      :" +firstMovie.getTicketPrice());
		
	}
}
