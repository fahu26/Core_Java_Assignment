package comm.fahim;

public class SortingNumber {
	public int[] bubbleSort(int []numbers)
	{
		int n =numbers.length;
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
			if(numbers[j-1]>numbers[j]) {
			temp=numbers[j-1];
			numbers[j-1]=numbers[j];
			numbers[j]=temp;
			}
			}
		}
		return numbers;
	}
}
