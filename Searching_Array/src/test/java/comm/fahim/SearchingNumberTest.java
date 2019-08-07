package comm.fahim;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SearchingNumberTest {

	static SearchingNumber searchNumber;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		searchNumber=new SearchingNumber();
	}

	@Test
	public void testIfNumberPresentInArrayList_True() {
		assertTrue(searchNumber.searchNumber(47));
	}
	
	@Test
	public void testIfNumberPresentInArrayList_False() {
		assertFalse(searchNumber.searchNumber(0));
	}
	
	@Test
	public void testIfNumberPresentInArrayList_NegativeNumber() {
		assertFalse(searchNumber.searchNumber(-47));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		searchNumber=null;
	}
}
