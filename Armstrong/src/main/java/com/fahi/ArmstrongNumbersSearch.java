package com.fahi;

import java.util.ArrayList;

public class ArmstrongNumbersSearch {

	  public Integer[] checkIsArmstrongBetweenNumberRange(int minLimit,int maxLimit) { 
	  int a,temp,n;
	  Integer[] arr;
	  ArrayList<Integer> number=new ArrayList<Integer>();
	 if(minLimit !=maxLimit) {
	  System.out.println("The following are the armstrong numbers between: "+minLimit +" & "+maxLimit); 
	  for(int i=minLimit;i<maxLimit;i++) {
	  int c=0;
	  n=i; 
	  temp=n; 
	  while(n>0) { 
	  a=n%10; n=n/10; c=c+(a*a*a); 
	  } 
	  if(temp==c) {
	  System.out.println(i); 
	  number.add(i);
	  }
	} 
	 }
	 
	 else { 
		 System.out.println("minimum range and maximum range cant be same");
	 }
      arr = new Integer[number.size()]; 
      arr = number.toArray(arr); 
	  return arr;
}
	  
	  public static void main(String args[]) {
		  ArmstrongNumbersSearch anumsearch =new ArmstrongNumbersSearch();
		  anumsearch.checkIsArmstrongBetweenNumberRange(0, 0);
	  }
}
