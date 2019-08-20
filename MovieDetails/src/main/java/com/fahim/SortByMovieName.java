package com.fahim;

import java.util.Comparator;

public class SortByMovieName implements Comparator<Movie_Details> {

@Override
public int compare(Movie_Details o1, Movie_Details o2) {
return o1.getMov_Name().compareTo(o2.getMov_Name());
}

}
