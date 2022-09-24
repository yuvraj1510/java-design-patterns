package com.ysingh.behavioral.visitor;

import com.ysingh.behavioral.visitor.interfaces.Item;
import com.ysingh.behavioral.visitor.interfaces.ShoppingCartVisitor;
import com.ysingh.behavioral.visitor.interfaces.impl.Book;
import com.ysingh.behavioral.visitor.interfaces.impl.Fruit;
import com.ysingh.behavioral.visitor.interfaces.impl.ShoppingCartVisitorImpl;

public class TestApp {

	public static void main(String[] args) {
		Item items[] = new Item[] {
				new Book("Core Java", "89657389", 450.0),
				new Book("Hibernate", "89757389", 450.0),
				new Fruit("Mango", 2, 100.0),
				new Fruit("Apple", 3, 200.0)
		};
 
		double totalCost = calculateTotalCost(items);
		System.out.println("Total Cost : "+totalCost);
	}

	private static double calculateTotalCost(Item[] items) {
		ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImpl();
		double totalCost = 0.0;
		
		for(Item item : items) {
			totalCost += item.accept(shoppingCartVisitor);
		}
		
		return totalCost;
	}

}
