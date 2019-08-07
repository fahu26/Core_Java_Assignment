package comm.fahim;

public class SearchingNumber {
	public boolean searchNumber(int number) {
		boolean isFound = false;
		int[] numbers = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		for (int number2 : numbers) {
			if (number2 == number) {
				System.out.println(number + " is present in the Array");
				isFound = true;
				break;
			}
		}
		return isFound;
	}
}
