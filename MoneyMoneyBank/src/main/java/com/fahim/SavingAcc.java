package com.fahim;

public abstract class SavingAcc extends BankAcc{
private boolean isSalaried;
private static final float MINBAL=1000f;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
	super(accNo, accNm, accBal);
	this.isSalaried = isSalaried;
}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}


	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}

	@Override
	abstract public void withdraw(float amnt);

}
