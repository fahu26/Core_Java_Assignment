package com.fahim;

public class Person implements Comparable<Person>{
private double personWeight;
private double personHeight;
private String personName;

public Person() {
	super();
}
public Person( String personName,double personWeight, double personHeight) {
	super();
	this.personWeight = personWeight;
	this.personHeight = personHeight;
	this.personName = personName;
}
public double getPersonWeight() {
	return personWeight;
}
public void setPersonWeight(double personWeight) {
	this.personWeight = personWeight;
}
public double getPersonHeight() {
	return personHeight;
}
public void setPersonHeight(double personHeight) {
	this.personHeight = personHeight;
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}

@Override 
public String toString() { 
	return personName+" : "+personWeight+" : "+personHeight;
}

@Override
public int compareTo(Person o) {
	// TODO Auto-generated method stub
       if (this.personName == o.getPersonName()) {
           return 0;
       } else if (this.personWeight < o.getPersonWeight()) {
           return -1;
       }
       else if(this.personWeight == o.getPersonWeight()) {
    	   if(this.personHeight < o.getPersonHeight()) {
    	   return -1;
       }
    }
	return 1;
}
}
