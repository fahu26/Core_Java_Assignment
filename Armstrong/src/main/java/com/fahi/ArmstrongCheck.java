package com.fahi;

public class ArmstrongCheck {
	public boolean checkIsArmstrong(int num) {
		int a,temp,n,c=0;
		temp=num;
		n=num;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c) {
	    	System.out.println(c +" is an Armstrong number.");
	    	return true;
	    }
		return false; 
	}
	
	public static void main(String args[]) {
		ArmstrongCheck acheck=new ArmstrongCheck();
		acheck.checkIsArmstrong(100);
	}

}
