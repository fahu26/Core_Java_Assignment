package com.fahim;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

public class TestLoginCredentials {
	static LoginCredentials credentialsmock;
	 static LoginCredentialsImpl credentialsImpl;
	 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		credentialsmock=Mockito.mock(LoginCredentials.class);
		credentialsImpl=new LoginCredentialsImpl(credentialsmock);
	}
	
	@Test
	public void testisInValidLogin() throws EmptyCredentialsException {
		String username="fahim";
		String password="12345";
		Mockito.when(credentialsmock.isAuthenticated(username, password)).thenReturn(false);
		boolean actual=credentialsImpl.isAuthenticated(username, password);
		assertFalse(actual);
	}
	
	@Test
	public void testisValidLogin() throws EmptyCredentialsException {
		String username="fahim";
		String password="123456";
		Mockito.when(credentialsmock.isAuthenticated(username, password)).thenReturn(true);
		boolean actual=credentialsImpl.isAuthenticated(username, password);
		assertTrue(actual);
	}
	
	/*
	 * @Test(expected = EmptyCredentialsException.class) public void
	 * testisLoginWithEMptyCredentials() throws EmptyCredentialsException {
	 * Mockito.when(credentialsmock.isAuthenticated("", "")).thenThrow(new
	 * EmptyCredentialsException()); credentialsImpl.isAuthenticated("", ""); }
	 */

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		credentialsmock=null;
		credentialsImpl=null;
	}
	
	
}
