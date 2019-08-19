package com.fahim;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRandomNumbersSerialization {
static RandomNumbersSerialization randomNumbers;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		randomNumbers=new RandomNumbersSerialization();
	}

	@Test
	public void testRandomNumbersSerialization_IsValidTrue() {
	assertTrue(randomNumbers.randomNumber_Serialize(10));
	}
	
	@Test
	public void testRandomNumbersSerialization_IsValidFalse() {
	assertFalse(randomNumbers.randomNumber_Serialize(0));
	}
	
	@Test
	public void testRandomNumbersSerialization_NegativeCount() {
	assertFalse(randomNumbers.randomNumber_Serialize(-5));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	randomNumbers=null;
	}

}
