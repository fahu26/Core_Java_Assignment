package comm.fahim;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ResultCalculationTest {
	static ResultCalculation resultCalculation;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	resultCalculation=new ResultCalculation();
	}

	@Test
	public void testIsResultPassed_All3Subjects() {
		assertEquals("Passed", resultCalculation.studentResult(60, 65, 70));
	}
	
	@Test
	public void testIsResultPassed_2Subjects() {
		assertEquals("Passed in 2 Subjects", resultCalculation.studentResult(10, 65, 70));
	}
	
	@Test
	public void testIsResultPassed_1Subject() {
		assertEquals("Passed in 1 Subject", resultCalculation.studentResult(60, 2, 0));
	}
	
	@Test
	public void testIsResultFailed_All3Subjects() {
		assertEquals("Failed", resultCalculation.studentResult(1, 0, 2));
	}
	
	@Test
	public void testWithNegativeMarks() {
		assertEquals("Invalid marks", resultCalculation.studentResult(-2, 0, 2));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		resultCalculation=null;
	}

}
