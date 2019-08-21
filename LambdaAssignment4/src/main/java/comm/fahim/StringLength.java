package comm.fahim;
import java.util.*;
public class StringLength {

	public static void main(String[] args)throws CloneNotSupportedException {
		
		ArrayList<Words> words = new ArrayList<Words>();
		words.add(new Words("hello", 5));
		words.add(new Words("Goodday", 7));
		words.add(new Words("Baseball",8));
		words.add(new Words("Days", 4));
		words.add(new Words("Sun", 3));
		for(Words word:words) {
		System.out.println(word);
		}
		System.out.println();
		System.out.println("After RemoveIf");
		words.removeIf((Words word)->word.getLength()%2 !=0);
		words.forEach(System.out::println);
				
	}
}