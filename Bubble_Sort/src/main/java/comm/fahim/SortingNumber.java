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
	public static void main(String[] args) {
		SortingNumber searchingNumber=new SortingNumber();
		int numbers[]= {5,12,4,6,78,19,1,23,26,35,37,7,52,86,74};
		searchingNumber.bubbleSort(numbers);
		System.out.println("After Sorting: ");
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
	}
}
