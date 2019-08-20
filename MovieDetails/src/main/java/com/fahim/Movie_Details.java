package com.fahim;

public class Movie_Details {
private String mov_Name;
private String lead_Actor;
private String lead_Actories;
private String genre;
public String getMov_Name() {
	return mov_Name;
}
public void setMov_Name(String mov_Name) {
	this.mov_Name = mov_Name;
}
public String getLead_Actor() {
	return lead_Actor;
}
public void setLead_Actor(String lead_Actor) {
	this.lead_Actor = lead_Actor;
}
public String getLead_Actories() {
	return lead_Actories;
}
public void setLead_Actories(String lead_Actories) {
	this.lead_Actories = lead_Actories;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
@Override
public String toString() {
	return "Movie_Name=" + mov_Name + ", lead_Actor=" + lead_Actor + ", lead_Actories=" + lead_Actories
			+ ", genre=" + genre;
}
public Movie_Details() {
	super();
}
public Movie_Details(String mov_Name, String lead_Actor, String lead_Actories, String genre) {
	super();
	this.mov_Name = mov_Name;
	this.lead_Actor = lead_Actor;
	this.lead_Actories = lead_Actories;
	this.genre = genre;
}
}
