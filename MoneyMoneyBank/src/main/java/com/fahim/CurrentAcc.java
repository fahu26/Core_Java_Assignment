package com.fahim;

public abstract class CurrentAcc extends BankAcc {
private final float creditLimit=1000f;

public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
	super(accNo, accNm, accBal);
}

public float getCreditLimit() {
	return creditLimit;
}

@Override
public String toString() {
	return "CurrentAcc [creditLimit=" + creditLimit + "]";
}

@Override
abstract public void withdraw(float amnt);

}
