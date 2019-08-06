package comm.fahim;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class IncomeTaxCalculationTest {

	public static IncomeTaxCalculation incomeTaxCalculator;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		incomeTaxCalculator=new IncomeTaxCalculation();
	}
	@Test
	public void testCalculateTaxAmountRangerBetween_0To180000() {
		assertEquals(0, incomeTaxCalculator.taxCalculator(180000),0f);
	}

	@Test
	public void testCalculateTaxAmountRangerBetween_181001To300000() {
		assertEquals(20000, incomeTaxCalculator.taxCalculator(200000),0f);
	}
	
	@Test
	public void testCalculateTaxAmountRangerBetween_300001To500000() {
		assertEquals(80000, incomeTaxCalculator.taxCalculator(400000),0f);
	}
	
	@Test
	public void testCalculateTaxAmountRangerBetween_500001To100000() {
		assertEquals(180000, incomeTaxCalculator.taxCalculator(600000),0f);
	}
	
	@Test
	public void testCalculateTaxAmount_CTCGreaterThanDefinedSlab() {
		assertEquals(0, incomeTaxCalculator.taxCalculator(2000000),0f);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		incomeTaxCalculator=null;
	}
}
