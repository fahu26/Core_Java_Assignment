package com.fahim;

public class MainBank {
	public static void main(String args[]) 
	{
		BankFactory mmbankfactory = new MMBankFactory();
		
		SavingAcc mmsavingacc = new MMSavingAcc(102, "Mehek", 8000, true);
		CurrentAcc  mmcurrentacc = new MMCurrentAcc(102, "Mehek", 8000, 2000);
		
		System.out.println("Transactions for Current Account");
		mmcurrentacc.withdraw(5000);
		System.out.println(mmcurrentacc);
		mmcurrentacc.deposit(500);
		System.out.println(mmcurrentacc);
		mmcurrentacc.withdraw(5000);
		System.out.println(mmcurrentacc);
		System.out.println();
		
		System.out.println("Transactions for Saving Account");
		System.out.println(mmsavingacc);
		mmsavingacc.withdraw(5000);
		System.out.println(mmsavingacc);
		mmsavingacc.withdraw(50000);
		System.out.println(mmsavingacc);
		
		//where account is not salaried
		SavingAcc  mmsavingacc2 = new MMSavingAcc(101, "Mehek", 8000, false);
		System.out.println(mmsavingacc2);
		mmsavingacc2.withdraw(4000);
		
	}
}
