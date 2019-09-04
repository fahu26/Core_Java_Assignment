package com.fahim;

public class MMSavingAcc extends SavingAcc {
private float MINBAL;

MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
	super(accNo, accNm, accBal, isSalaried);
}

@Override
public void withdraw(float amnt) {
	// TODO Auto-generated method stub
	if(isSalaried()) {
		if(getAccBal()-amnt>0) {
			setAccBal(getAccBal()-amnt);
		}
		else {
			System.out.println("Withdraw Failed");
		}
		
	}
	else {
		if((getAccBal()-amnt)>=MINBAL) {
			setAccBal(getAccBal()-amnt);
		}
		else {
			System.out.println("Withdraw Failed");
		}
	}
}


}
