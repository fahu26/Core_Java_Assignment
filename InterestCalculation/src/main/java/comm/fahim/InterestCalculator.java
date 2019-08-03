package comm.fahim;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class InterestCalculator {
	BigDecimal bd;
	public double SimpleInterest(double principal,double rate,double years) {
		double interest=0;
		interest=(principal*rate*years);
		bd=new BigDecimal(interest);
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
		System.out.println("Simple Interest: "+bd.doubleValue());
		return bd.doubleValue();
	}
	
	public double CompoundInterest(double principal,double rate,double years) {
		
		double amount,compoundInterest,t=1;
		double tenure=(1+rate/100);
		for(int i=0;i<years;i++) {
		t*=tenure;
		}
		amount=principal*t;
		compoundInterest=amount - principal;
		bd = new BigDecimal(compoundInterest);
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
		System.out.println("Compound Interest: "+bd.doubleValue());
		return bd.doubleValue();
	}
	
	public static void main(String args[]) {
		InterestCalculator interestCalculator=new InterestCalculator();
		Scanner sf=new Scanner(System.in);
		double principal,rate,years;
		System.out.println("Enter the Prinicpal");
		principal=sf.nextDouble();
		System.out.println("Enter the Rate");
		rate=sf.nextDouble();
		System.out.println("Enter the Years");
		years=sf.nextDouble();
		sf.close();
		interestCalculator.SimpleInterest(principal, rate, years);
		interestCalculator.CompoundInterest(principal, rate, years);
	}
	
	
}
