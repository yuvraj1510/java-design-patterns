package com.ysingh.behavioral.strategy;

import com.ysingh.behavioral.strategy.interfaces.impl.CreditCardPaymentMethod;
import com.ysingh.behavioral.strategy.interfaces.impl.PayPalPaymentMethod;
import com.ysingh.behavioral.strategy.model.Product;

public class TestApp {

	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();
		
		Product product1 = new Product("Soap", "123456", 100);
		Product product2 = new Product("Shampoo", "123457", 120);
		Product product3 = new Product("Chocolate", "123458", 50);
		
		shoppingCart.addProduct(product1);
		shoppingCart.addProduct(product2);
		shoppingCart.addProduct(product3);
		
		shoppingCart.payment(new CreditCardPaymentMethod("112233445566778899", "012", "Test Test", "09/25"));
		
		System.out.println("----------------------------------");
		
		shoppingCart = new ShoppingCart();
		
		product1 = new Product("Milk", "123459", 50);
		product2 = new Product("Beer", "123460", 240);
		
		shoppingCart.addProduct(product1);
		shoppingCart.addProduct(product2);
		
		shoppingCart.payment(new PayPalPaymentMethod("test@gmail.com", "xxxxxxx"));
	}

}
