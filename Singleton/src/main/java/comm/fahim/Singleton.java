package comm.fahim;

public class Singleton {
		private static Singleton single_instance = null; 
		public String str; 
		private Singleton() 
		{ 
			str = "Hello I am a string part of Singleton class"; 
		} 

		public static Singleton getInstance() 
		{ 
			if (single_instance == null) 
				single_instance = new Singleton(); 

			return single_instance; 
		} 

		public static void main(String args[]) 
		{ 
			Singleton x = Singleton.getInstance(); 
			System.out.println("String from x is " + x.str); 
		} 
}