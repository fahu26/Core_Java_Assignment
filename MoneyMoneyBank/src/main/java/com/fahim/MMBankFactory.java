package com.fahim;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		SavingAcc savingacc = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return savingacc;
	}
	
	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		CurrentAcc currentAcc = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return currentAcc;
	}
	
}
