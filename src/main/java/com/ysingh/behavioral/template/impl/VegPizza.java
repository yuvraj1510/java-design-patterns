package com.ysingh.behavioral.template.impl;

import com.ysingh.behavioral.template.PizzaTemplate;

public class VegPizza extends PizzaTemplate {

	@Override
	public void selectBread() {
		System.out.println("Selecting the Bread for Veg Pizza");
	}

	@Override
	public void addingIngredients() {
		System.out.println("Adding the Ingredients for Veg Pizza");
	}

}
