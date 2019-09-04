package com.fahim;

public interface LoginCredentials {
public boolean isAuthenticated(String username,String password) throws EmptyCredentialsException;
}
