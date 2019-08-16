package com.fahim;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Exception.InsufficientBalanceException;

public class TestBankAccount {
static Account bankAccount;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bankAccount=new Account();
		
	}

	@Test(expected = InsufficientBalanceException.class)
	public void testIsAmountGreaterThanAvailableBalance() {
		assertFalse(bankAccount.withdraw(12000));
	}
	
	@Test
	public void testIsAmountLessThanAvailableBalance() {
		assertTrue(bankAccount.withdraw(1200));
	}
	
	@Test(expected = InsufficientBalanceException.class)
	public void testAmountEnteredInvalid() {
		assertFalse(bankAccount.withdraw(0));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		bankAccount=null;
	}

}
