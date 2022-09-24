package com.ysingh.behavioral.visitor.interfaces.impl;

import com.ysingh.behavioral.visitor.interfaces.ShoppingCartVisitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public double visit(Book book) {
		double cost = book.getPrice();
		if(book.getPrice() > 500) {
			cost = book.getPrice() - 100;
		}
		
		System.out.println("Book : "+book.getName()+", ISBN Number : "+book.getIsbnNumber()+", Cost : "+cost);
		return cost;
	}

	@Override
	public double visit(Fruit fruit) {
		double cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println("Fruit : "+fruit.getName()+", Cost : "+cost);
		return cost;
	}

}
