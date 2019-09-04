package com.fahim;

public class LoginCredentialsImpl implements LoginCredentials {
	private LoginCredentials authenticator;
	 

    public LoginCredentialsImpl(LoginCredentials authenticator) {
        this.authenticator = authenticator;
    }
	
	public boolean isAuthenticated(String username,String password)throws EmptyCredentialsException {
		if(username=="fahim" && password=="123456") {
			System.out.println("Valid credentials");
			return true;
		}
		else {
			System.out.println("Invalid credentials");
			return false;
		}
	}
	
}
