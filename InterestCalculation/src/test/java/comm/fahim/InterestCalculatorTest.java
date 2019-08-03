package comm.fahim;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class InterestCalculatorTest {
static InterestCalculator interestCalculator;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	interestCalculator=new InterestCalculator();
	}


	//@SuppressWarnings("deprecation")
	@Test
	public void testCalculateSimpleInterest_NotAvoidingdecimaldifference() {
		assertEquals(65000, interestCalculator.SimpleInterest(1000, 13, 5), 0.0f);
	}

	@Test
	public void testCalculateSimpleInterest_AvoidingdecimaldifferenceUptoPoint5() {
		assertEquals(65000.45, interestCalculator.SimpleInterest(1000, 13, 5), 0.5f);
	}

	@Test
	public void testCalculateCompoundInterest_NotAvoidingdecimaldifference() {
		assertEquals(331.00, interestCalculator.CompoundInterest(1000, 10, 3), 0.0f);
	}
	
	@Test
	public void testCalculateCompoundInterest_AvoidingdecimaldifferenceUptoPoint2() {
		assertEquals(331.19, interestCalculator.CompoundInterest(1000, 10, 3), 0.2f);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		interestCalculator=null;
	}
}
