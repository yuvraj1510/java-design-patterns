package com.ysingh.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

import com.ysingh.behavioral.strategy.interfaces.PaymentMethod;
import com.ysingh.behavioral.strategy.model.Product;

public class ShoppingCart {

	private List<Product> products;
	
	public ShoppingCart() {
		products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void removeProduct(Product product) {
		products.remove(product);
	}
	
	private int calculateTotalPrice() {
		return products.stream().map(product -> product.getPrice()).reduce(0, Integer::sum);
	}
	
	public void payment(PaymentMethod paymentMethod) {
		paymentMethod.pay(calculateTotalPrice());
	}
}
