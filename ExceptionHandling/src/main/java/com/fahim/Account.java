package com.fahim;

import com.Exception.InsufficientBalanceException;

public class Account {
private int balance=10000;
	public boolean withdraw(double amount) throws InsufficientBalanceException {
		boolean isAvailable=false;
		if(amount<=0) {
			throw new InsufficientBalanceException("Amount entered is invalid");
		}
		else if(amount>balance) {
			throw new InsufficientBalanceException("Your bank account have insufficient balance for this transaction");
		}
		else {
			isAvailable=true;
			balance-=amount;
		}
		return isAvailable;
	}
}
