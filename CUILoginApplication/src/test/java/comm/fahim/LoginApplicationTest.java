package comm.fahim;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginApplicationTest {

	static LoginApplication application;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		application=new LoginApplication();
	}

	@Test
	public void testLoginValiationWithBlankCredentials() {
	assertFalse(application.Login("", ""));;
	}
	
	@Test
	public void testLoginValiationWithBadCredentials() {
	assertFalse(application.Login("Abcsd", "124856"));;
	}
	
	@Test
	public void testLoginValiationWithCorrectCredentials() {
	assertTrue(application.Login("fahim", "123456"));;
	}
	
	@Test
	public void testLoginValiationWithCorrectCredentials_CheckingCaseSensitivity() {
	assertFalse(application.Login("Fahim", "123456"));;
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		application=null;
	}

}
