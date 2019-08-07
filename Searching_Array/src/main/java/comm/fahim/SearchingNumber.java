package comm.fahim;

import java.util.ArrayList;
import java.util.List;

public class SearchingNumber {
	public boolean searchNumber(int number)
	{
		boolean isFound=false;
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(12);
		numbers.add(14);
		numbers.add(6);
		numbers.add(78);
		numbers.add(19);
		numbers.add(1);
		numbers.add(23);
		numbers.add(26);
		numbers.add(35);
		numbers.add(37);
		numbers.add(7);
		numbers.add(52);
		numbers.add(86);
		numbers.add(47);
		if(numbers.contains(number))
		{
			System.out.println(number+" is present in the ArrayList");
			isFound=true;
		}
		else {
			System.out.println(number+" is not present in the ArrayList");
			isFound=false;
		}
		return isFound;
	}
}
