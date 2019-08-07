package comm.fahim;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {
public static Employee employee1,employee2,employee3,employee4,employee5,employee6;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	employee1=new Manager(10000, 2000);
	employee2=new Labour(10000,3000);
	employee3=new Employee(10000) {
		@Override
		double getSalaryAmount() {
			return 10000;
		}
	};
	employee4=new Manager(0,0);
	employee5=new Labour(0,0);
	employee6=new Employee(0) {
		@Override
		double getSalaryAmount() {
			return 0;
		}
	};
	}

	@Test
	public void testManagerSalary() {
		assertEquals(12000, employee1.getSalaryAmount(),0f);
	}
	
	@Test
	public void testLabourSalary() {
		assertEquals(13000, employee2.getSalaryAmount(),0f);
	}
	
	@Test
	public void testLabourEmployee1() {
		assertEquals(10000, employee3.getSalaryAmount(),0f);
	}
	
	@Test
	public void testManagerSalary_Zero() {
		assertEquals(0, employee4.getSalaryAmount(),0f);
	}
	
	@Test
	public void testLabourSalary_Zero() {
		assertEquals(0, employee5.getSalaryAmount(),0f);
	}
	
	@Test
	public void testLabourEmployee_Zero() {
		assertEquals(0, employee6.getSalaryAmount(),0f);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		employee1=null;
		employee2=null;
		employee3=null;
		employee4=null;
		employee5=null;
		employee6=null;
		
	}

}
