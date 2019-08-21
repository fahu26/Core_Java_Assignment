package comm.fahim;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PrintOrders {

	public static void main(String[] args) {
		List<Orders> orders=new ArrayList<Orders>();
		orders.add(new Orders("Lux", 12000, "Accepted"));
		orders.add(new Orders("Maggi", 1000, "Completed"));
		orders.add(new Orders("Havells", 9999, "Accepted"));
		orders.add(new Orders("Lights", 15000, "Completed"));
		orders.add(new Orders("Laptop", 20000, "Accepted"));
		for(Orders orders2:orders) {
			System.out.println(orders2);
		}
		System.out.println();
		System.out.println("Orders with price greater than 10000:");
		performBasedOnCriteria(orders,(order1)->order1.getPrice()>10000 && (order1.getStatus()=="Accepted" || order1.getStatus()=="Completed"),
				order1->System.out.println(order1));
		System.out.println();
		
	     List<String> orderNames = new ArrayList<String>();
	     orderNames.add("Lux");
	     orderNames.add("Havells");
	     orderNames.add("Orient");       
	     orderNames.add("MAggi");
	 
	     orderNames.stream().forEach((item)-> {
	            printNames(()-> item);
	        });
	    }
	 
	public static void performBasedOnCriteria(List<Orders> itemOrders,Predicate<Orders> predicate,Consumer<Orders> consumer) {
		for(Orders order:itemOrders) {
			if(predicate.test(order)) {
				consumer.accept(order);
			}
		}
		
	}
	
	  private static void printNames(Supplier<String> supplier) {
	        System.out.println(supplier.get());
	    }
}