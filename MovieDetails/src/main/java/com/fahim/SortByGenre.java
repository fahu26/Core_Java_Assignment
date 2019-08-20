package com.fahim;

import java.util.Comparator;

public class SortByGenre implements Comparator<Movie_Details> {

@Override
public int compare(Movie_Details o1, Movie_Details o2) {
return o1.getGenre().compareTo(o2.getGenre());
}

}


