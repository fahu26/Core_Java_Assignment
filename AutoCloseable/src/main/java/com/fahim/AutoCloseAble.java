package com.fahim;
import java.io.*;
public class AutoCloseAble {
    	public boolean isFilePresent(String fileName) {
    	boolean isPresent=false;
        try(BufferedReader rd = new BufferedReader(new FileReader(fileName))) {
            String inputLine = null;
            while((inputLine = rd.readLine()) != null)
                System.out.println(inputLine);
            isPresent=true;
        }
        catch (IOException ex) {
            System.err.println("An IOException was caught: " + ex.getMessage());
        }
    return isPresent;
    	}
    }