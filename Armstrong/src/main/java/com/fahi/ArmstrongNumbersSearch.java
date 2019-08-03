package com.fahi;

import java.util.ArrayList;

public class ArmstrongNumbersSearch {

	  public Integer[] checkIsArmstrongBetweenNumberRange(int minLimit,int maxLimit) { 
	  int a,temp,n;
	  ArrayList<Integer> number=new ArrayList<Integer>();
	  System.out.println("The following are the armstrong numbers between: "+minLimit +" & "+maxLimit); 
	  for(int i=minLimit;i<maxLimit;i++) {
	  int c=0;
	  n=i; 
	  temp=n; 
	  while(n>0) { 
	  a=n%10; n=n/10; c=c+(a*a*a); 
	  } 
	  if(temp==c) {
	  System.out.println(c); 
	  number.add(c);
	  }
	} 

      Integer[] arr = new Integer[number.size()]; 
      arr = number.toArray(arr); 
	  return arr;
}
}
