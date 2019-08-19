package com.fahim;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortPersons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Person> person=new TreeSet<Person>();
		person.add(new Person("Joel",70, 190));
		person.add(new Person("Jack",60, 170));
		person.add(new Person("Jones",100, 100));
		person.add(new Person("Tom",70, 177));
		person.add(new Person("Lee",85, 120));
		person.add(new Person("Sam",75, 178));
		for(Person p:person) {
			System.out.println(p);
		}
	}

}
