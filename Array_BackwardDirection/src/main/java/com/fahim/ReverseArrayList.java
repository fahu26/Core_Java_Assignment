package com.fahim;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseArrayList {
	public static void main(String args[]) {
	List<Integer> result=new ArrayList<Integer>();
	result.add(10);
	result.add(5);
	result.add(2);
	
	ListIterator<Integer> iterator=result.listIterator();
	System.out.println("Forward Direction:");
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println();
	System.out.println("Backward Direction:");
	while(iterator.hasPrevious()) {
		System.out.println(iterator.previous());
	}
}
}
