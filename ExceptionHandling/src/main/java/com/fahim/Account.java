package com.fahim;

import java.io.IOException;

import com.Exception.InsufficientBalanceException;

public class Account {
private int balance=10000;
	public boolean withdraw(int amount) throws InsufficientBalanceException {
		boolean isAvailable=false;
		if(amount<=0) {
			NumberFormatException  ae=new NumberFormatException("Exception");
			ae.initCause(new IOException("Amount entered is invalid"));
			throw ae;
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
	
	public static void main(String args[]) {
		Account account=new Account();
		account.withdraw(0);
		account.withdraw(12000);
		account.withdraw(9000);
		
	}
}
