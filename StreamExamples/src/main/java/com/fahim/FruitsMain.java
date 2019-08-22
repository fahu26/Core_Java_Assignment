package com.fahim;

import java.util.*;
public class FruitsMain {

	public static void main(String[] args) {
		List<Fruit> fruit = Arrays.asList(
				new Fruit("Apple",150,200,"red"),
				new Fruit("Pineapple",80,60,"yellow"),
				new Fruit("Apple",110,120,"red"),
				new Fruit("Grapes",95,100,"green")
				);

		System.out.println("Fruits Filtered based on Calories:");
		fruit.stream()
		.filter(f->f.getCalories() <=100)
		.sorted(Comparator.comparingInt(Fruit::getCalories))
		.forEach(f->System.out.println(f));

		System.out.println();
		System.out.println("Fruits sorted based on color:");
		fruit.stream()
		.sorted(Comparator.comparing(Fruit::getColor))
		.forEach(f->System.out.println(f));

		System.out.println();
		System.out.println("Fruits sorted based on color and PRice:");
		fruit.stream()
		.filter(f->f.getColor()=="red")
		.sorted(Comparator.comparingInt(Fruit::getPrice))
		.forEach(f->System.out.println(f));
	}
}
