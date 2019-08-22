package com.fahim;

import java.util.*;
import java.util.stream.Collectors;

public class TransactionMain {

	public static void main(String[] args) {
		List<Transaction> transaction = Arrays.asList(
				new Transaction(new Trader("Anand", "Pune"), 2016, 10000),
				new Transaction(new Trader("Neeraja", "Indore"), 2015, 25000),
				new Transaction(new Trader("Yog", "Mumbai"), 2011, 33000),
				new Transaction(new Trader("Lokesh", "Nagpur"), 2016, 200000),
				new Transaction(new Trader("Komal", "Pune"), 2011, 80000),
				new Transaction(new Trader("Ishwar", "Indore"), 2016, 12000));

		transaction.stream()
		.filter(transactions -> transactions.getYear()==2011)
		.sorted(Comparator.comparing(Transaction::getValue))
		.collect (Collectors.toList())
		.forEach(transactions->System.out.println(transactions));

		List<String> uniqueCities=transaction.stream()
				.map(Transaction::getTrader)
				.map(Trader::getCity)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(uniqueCities);

		List<Trader> name=transaction.stream()
				.filter(city->city.getTrader().getCity().equals("Pune"))
				.map(Transaction::getTrader)
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		System.out.println(name);

		String namesort=transaction.stream()
				.map(Transaction::getTrader)
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList()).toString();
		System.out.println(namesort);

		Optional<Trader> indoreTraders = transaction.stream()
				.filter(city -> city.getTrader().getCity() == "Indore")
				.map(Transaction::getTrader)	
				.findAny();
		System.out.println(indoreTraders);

		Optional<Transaction> delhiTraders =transaction
				.stream()
				.filter(cityName->cityName.getTrader().getCity().equalsIgnoreCase("delhi"))
				.findAny();
		System.out.println(delhiTraders.isPresent());

		Integer  highestTransaction = transaction.stream()
				.collect(Collectors.groupingBy(value->value.getValue(),Collectors.counting()))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByKey()).get().getKey();;
				System.out.println("Transaction with Highest Value :"+highestTransaction);

				Integer  lowestTransaction = transaction.stream()
						.collect(Collectors.groupingBy(value->value.getValue(),Collectors.counting()))
						.entrySet()
						.stream()
						.min(Map.Entry.comparingByKey()).get().getKey();;
						System.out.println("Transaction with lowest Value :"+lowestTransaction);
	}	
}
