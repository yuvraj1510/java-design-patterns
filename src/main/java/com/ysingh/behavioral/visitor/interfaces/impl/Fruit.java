package com.ysingh.behavioral.visitor.interfaces.impl;

import com.ysingh.behavioral.visitor.interfaces.Item;
import com.ysingh.behavioral.visitor.interfaces.ShoppingCartVisitor;

public class Fruit implements Item {

	private String name;
	private int weight;
	private double pricePerKg;

	public Fruit(String name, int weight, double pricePerKg) {
		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public double getPricePerKg() {
		return pricePerKg;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
