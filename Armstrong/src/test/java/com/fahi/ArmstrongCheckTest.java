package com.fahi;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArmstrongCheckTest {

	ArmstrongCheck armsCheck;
	 @Before
	 public void setUp() throws Exception {
		 armsCheck=new ArmstrongCheck();
	 }

	@Test
	public void testIsNumberPassedArmstrong() {
		assertTrue(armsCheck.checkIsArmstrong(153));
	}

	@Test
	public void testIsNumberPassedNotArmstrong() {
		assertFalse(armsCheck.checkIsArmstrong(9));
	}
	
	@Test
	public void testIsNumberPassed_NotValid() {
		assertFalse(armsCheck.checkIsArmstrong(-2));
	}
	
	@Test
	public void testIsNumberPassed_Valid() {
		assertFalse(armsCheck.checkIsArmstrong(5));
	}
	
	@After
	public void tearDown() throws Exception {
		armsCheck=null;
	}
}
