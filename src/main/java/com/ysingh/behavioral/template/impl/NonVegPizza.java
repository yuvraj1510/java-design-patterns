package com.ysingh.behavioral.template.impl;

import com.ysingh.behavioral.template.PizzaTemplate;

public class NonVegPizza extends PizzaTemplate {

	@Override
	public void selectBread() {
		System.out.println("Selecting the Bread for Non-Veg Pizza");
	}

	@Override
	public void addingIngredients() {
		System.out.println("Adding the Ingredients for Non-Veg Pizza");
	}

}
