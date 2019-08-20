package com.fahim;

import java.util.*;

public class Movie_DetailsList {
	static List<Movie_Details> movDetails=new ArrayList<Movie_Details>();
	public static void main(String args[]){
	Movie_Details m1=new Movie_Details("Ready","Salman", "Asin","Comedy");
	Movie_Details m2=new Movie_Details("Dabangg","Salman", "Sonakshi","Comedy");
	Movie_DetailsList detailsList=new Movie_DetailsList();
	detailsList.add_movie(m1);
	detailsList.add_movie(m2);
	
	Iterator< Movie_Details> mov=movDetails.iterator();
	while(mov.hasNext())
	System.out.println(mov.next());
	
	detailsList.remove_AllMovies();
	System.out.println();
	
	Movie_Details m3=new Movie_Details("123","Salman", "Asin","Comedy");
	Movie_Details m4=new Movie_Details("456","Salman", "Sonakshi","Comedy");
	detailsList.add_movie(m3);
	detailsList.add_movie(m4);
	
	Iterator< Movie_Details> mov1=movDetails.iterator();
	while(mov1.hasNext()) {
	System.out.println(mov1.next());
	detailsList.sortMovies("genre");
	detailsList.remove_movie(m4);
			
			  if(mov1.next().getMov_Name() == m4.getMov_Name()) {
			  System.out.println(mov1.next()); }
			 
	}
	System.out.println();
	}
	
	public Movie_Details add_movie(Movie_Details movie){
		movDetails.add((Movie_Details) movie);
		return movie;
	}
	
	public void remove_AllMovies() {
		 movDetails.clear();
	}
	
	public Movie_Details remove_movie(Movie_Details movie){
		movDetails.remove(movie);
		return movie;
	}
	
	public Movie_Details sortMovies(String criteria) {
		if(criteria == "movie") {
	    Collections.sort(movDetails, new SortByMovieName());
	    System.out.println(movDetails);
		}
		else if(criteria == "actor") {
		    Collections.sort(movDetails, new SortByArtistName());
		    System.out.println(movDetails);
			}
		else if(criteria == "actress") {
		    Collections.sort(movDetails, new SortByActressName());
		    System.out.println(movDetails);
			}
		else if(criteria == "genre") {
		    Collections.sort(movDetails, new SortByGenre());
		    System.out.println(movDetails);
			}
		return (Movie_Details) movDetails;
		}
	}