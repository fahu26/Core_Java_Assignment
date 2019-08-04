package comm.fahim;
import java.util.Scanner;

public class ResultCalculation {
	public String studentResult(double english,double maths,double science) {
		String result="";
		if(english>=0 && maths>=0 && science>=0) {
		if(english>=60 && maths>=60 && science>=60) {
			System.out.println("Passed");
			result="Passed";
		}
		else if((english>=60 && maths>=60) ||(english>=60 && science>=60) || (maths>=60 && science>=60)) {
			System.out.println("Passed in 2 Subjects");
			result="Passed in 2 Subjects";
		}
		
		else if(english>=60 || maths>=60 || science>=60) {
			System.out.println("Passed in 1 Subject");
			result="Passed in 1 Subject";
		}
		else {
			System.out.println("Failed");
			result="Failed";
		}
		}
		else {
			System.out.println("Invalid marks");
			result="Invalid marks";
		}
		return result;
	}
	
public static void main(String[] args) {
ResultCalculation resultCalculation=new ResultCalculation();
double english,maths,science;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter marks of English:");
english=scanner.nextDouble();
System.out.println("Enter marks of Maths:");
maths=scanner.nextDouble();
System.out.println("Enter marks of Science:");
science=scanner.nextDouble();
scanner.close();
resultCalculation.studentResult(english, maths, science);

	}

}
