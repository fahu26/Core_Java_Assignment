package com.fahim;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAutoCloseAble {
static AutoCloseAble autocloseable;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		autocloseable=new AutoCloseAble();
	}

	@Test
	public void testIsFilePresent_ReturnTrue() {
		assertTrue(autocloseable.isFilePresent("file1.txt"));
	}
	
	@Test
	public void testIsFilePresent_ReturnFalse() {
		assertFalse(autocloseable.isFilePresent("file2.txt"));
	}
	
	@Test
	public void testIsFilePresentWithEmptyInput_ReturnFalse() {
		assertFalse(autocloseable.isFilePresent(""));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		autocloseable=null;
	}

}
