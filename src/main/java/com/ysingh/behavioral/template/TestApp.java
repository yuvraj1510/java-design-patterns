package com.ysingh.behavioral.template;

import com.ysingh.behavioral.template.impl.NonVegPizza;
import com.ysingh.behavioral.template.impl.VegPizza;

public class TestApp {

	public static void main(String[] args) {
		
		PizzaTemplate vegPizza = new VegPizza();
		vegPizza.preparePizza();

		System.out.println("----------------------------------------------");
		
		PizzaTemplate nonVegPizza = new NonVegPizza();
		nonVegPizza.preparePizza();

	}

}
