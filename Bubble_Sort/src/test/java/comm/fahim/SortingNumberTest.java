package comm.fahim;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SortingNumberTest {
static SortingNumber sortingNumber; 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sortingNumber=new SortingNumber();
	}

	@Test
	public void testIfNumberAreSortedCorrectly_PassCase() {
		int [] numbers= {3,0,2,1};
		int [] sortedNumber= {0,1,2,3};
		assertArrayEquals(sortedNumber,sortingNumber.bubbleSort(numbers));
	}
	
	@Test
	public void testIfNumberAreSortedCorrectly_FailCase() {
		int [] numbers= {1,0,3,2};
		int [] sortedNumber= {1,0,3,2};
		assertArrayEquals(sortedNumber,sortingNumber.bubbleSort(numbers));
	}
	
	@Test
	public void testIfNumberAreSortedCorrectly_SizeMisMatchCase() {
		int [] numbers= {1,0,3,2};
		int [] sortedNumber= {1,0,3};
		assertArrayEquals(sortedNumber,sortingNumber.bubbleSort(numbers));
	}
	
	@Test
	public void testIfNumberAreSortedCorrectly_EmptyInputCase() {
		int [] numbers= {};
		int [] sortedNumber= {};
		assertArrayEquals(sortedNumber,sortingNumber.bubbleSort(numbers));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		sortingNumber=null;
	}

}
