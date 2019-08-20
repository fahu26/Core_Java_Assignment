package comm.fahim;

public class ArithmeticOperation {

	public static void main(String[] args) {
		LambdaExampleAdd addExample=(a,b)->{System.out.println(a+b);
		return 1;};
		LambdaExampleSubtract subtractExample=(a,b)->{System.out.println(a-b);
		return 1;};
		LambdaExampleMultiply multiplyExample=(a,b)->{System.out.println(a*b);
		return 1;};
		LambdaExampleDivide divideExample=(a,b)->{
			if(b==0){
				return 0;
				}
			System.out.println(a/b);
			return 1;
		};
		// TODO Auto-generated method stub
		addExample.add(2, 5);
		subtractExample.subtract(10, 5);
		multiplyExample.multiply(10, 10);
		divideExample.divide(15, 5);
	}

}

@FunctionalInterface
interface LambdaExampleAdd {
public int add(int a,int b);
}

@FunctionalInterface
interface LambdaExampleSubtract {
public int subtract(int a,int b);
}

@FunctionalInterface
interface LambdaExampleMultiply {
public int multiply(int a,int b);
}

@FunctionalInterface
interface LambdaExampleDivide {
public int divide(int a,int b);
}
