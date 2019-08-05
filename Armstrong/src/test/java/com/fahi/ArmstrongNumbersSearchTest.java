package com.fahi;

import static org.junit.Assert.*;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArmstrongNumbersSearchTest {
	static ArmstrongCheck armsCheck;
	static ArmstrongNumbersSearch armsSearchCheck;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		armsCheck=new ArmstrongCheck();
		armsSearchCheck=new ArmstrongNumbersSearch();
	}
	
	@Test
	public void testValidResultsWhenNumberRangeis100To1000() {
		Integer[] number= {153,370,371,407};
		assertArrayEquals(number, armsSearchCheck.checkIsArmstrongBetweenNumberRange(100, 1000));
	}
	
	@Test
	public void testValidResultsWhenNumberRangeis0To100() {
		Integer[] number= {0,1};
		assertArrayEquals(number, armsSearchCheck.checkIsArmstrongBetweenNumberRange(0, 100));
	}
	
	@Test
	public void testSameValuesFor_MinRangeAndMAxRange() {
		Integer[] number= {};
		assertArrayEquals(number, armsSearchCheck.checkIsArmstrongBetweenNumberRange(0, 0));
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		armsCheck=null;
		armsSearchCheck=null;
	}
}
