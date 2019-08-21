package comm.fahim;
import java.util.*;

public class Threadexample
{ 
	public static void main(String[] args) throws InterruptedException { 
		final ConsumerExample example = new ConsumerExample(); 
		Thread t1 = new Thread(new Runnable() 
		{ 
			@Override
			public void run() 
			{ 
				try
				{ 
					example.consume(); 
				} 
				catch(InterruptedException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
		}); 
		t1.start(); 
		} 

	public static class ConsumerExample { 
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		public void consume() throws InterruptedException 
		{ 
			for(int i=0;i<3;i++){ 
				synchronized (this) 
				{ 
					System.out.println("Consumer consumed-"+ list); 
				} 
			} 
		} 
	} 
} 

