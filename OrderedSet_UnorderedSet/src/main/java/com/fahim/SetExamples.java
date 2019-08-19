package com.fahim;

import java.util.*;

public class SetExamples {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> hashSet=new HashSet<Integer>();
		Set<Integer> hashLinkedSet=new LinkedHashSet<Integer>();
		hashSet.add(10);
		hashSet.add(5);
		hashSet.add(2);
		
		hashLinkedSet.add(10);
		hashLinkedSet.add(5);
		hashLinkedSet.add(2);
		
		
		System.out.println(hashLinkedSet);
		System.out.println(hashSet);
		
		
	}

	
	
	/*
	 * private int [] as;
	 * 
	 * public Set<Integer> isHashSetSorted(Integer arr[]) { Set<Integer> set = new
	 * HashSet<>(Arrays.asList(arr)); return set; }
	 * 
	 * public int[] isLinkedHashSetSorted(Integer arr[]) { Set<Integer> set = new
	 * LinkedHashSet<>(Arrays.asList(arr));
	 * 
	 * Iterator<Integer> itr = set.iterator(); as = null; for(int
	 * i=1;i<set.size();i++) { while (itr.hasNext()) {
	 * System.out.println(itr.next()); as[i]=itr.next();
	 * 
	 * } }
	 * 
	 * return as; }
	 */
}
