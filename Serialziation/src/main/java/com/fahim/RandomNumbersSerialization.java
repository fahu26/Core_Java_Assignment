package com.fahim;

import java.io.*;
import java.util.*;
class RandomNumbers implements Serializable{
ArrayList<Integer> numbers;
public RandomNumbers(ArrayList<Integer> numbers) {
	super();
	this.numbers = numbers;
}
	private static final long serialVersionUID = 1L;
	
}
class RandomNumbersSerialization {
	//public static void main(String args[]) {
	public boolean randomNumber_Serialize(int count) {
		boolean isValid=false;
		int totalCount=count;
		if(count>0) {
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		ArrayList<Integer> numbers2= new ArrayList<Integer>();
		Random random=new Random(); 
		for(int i=0;i<totalCount;i++) {
			numbers.add(random.nextInt(count));
		}
		System.out.println(numbers);
		numbers.sort(null);
		RandomNumbers object=new RandomNumbers(numbers);
		String filename = "NumberList.ser"; 
        
        // Serialization  
        try
        {    
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
            out.writeObject(object); 
            out.close(); 
            file.close(); 
        } 
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        
        //De-Serialization
        RandomNumbers object1=null;
        try
        {    
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
            object1 = (RandomNumbers) in.readObject(); 
            in.close(); 
            file.close(); 
            numbers2.addAll(object1.numbers);
            System.out.println("Random Numbers After De-Serialization"); 
            System.out.println(numbers2); 
        } 
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
        
        Collections.shuffle(numbers2);
        System.out.println("After Repositioning of elements:");
        System.out.println(numbers2);
        isValid=true;
		}
		else {
			System.out.println("Please eneter valid count of Random Numbers");
		}
        return isValid;
	}

}
