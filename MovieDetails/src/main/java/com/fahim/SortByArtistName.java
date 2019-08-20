package com.fahim;

import java.util.Comparator;

public class SortByArtistName implements Comparator<Movie_Details> {

@Override
public int compare(Movie_Details o1, Movie_Details o2) {
return o1.getLead_Actor().compareTo(o2.getLead_Actor());
}

}
