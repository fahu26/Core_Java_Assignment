package com.fahim;

public class MMCurrentAcc extends CurrentAcc {

	MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		super(accNo, accNm, accBal, creditLimit);
	}
	
	
	@Override
	public void withdraw(float amount)
	{
		if((((getAccBal() + getCreditLimit())) - amount) >= 0)
		{
			setAccBal(getAccBal() - amount);
		}
		else
		{
			System.out.println("Failed");
		}
	}

	@Override
	public String toString()
	{
		return "MMCurrentAcc [toString()=" +super.toString() + "]";
	}
}
