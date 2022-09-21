package com.ysingh.behavioral.template;

public abstract class PizzaTemplate {
	
	public final void preparePizza() {
		selectBread();
		addingIngredients();
		cooking();
		addingCheese();
		addingTopinngs();
	}

	
	public abstract void selectBread();
	public abstract void addingIngredients();
	
	public void cooking() {
		System.out.println("Cooking Pizza for 15 mins");
	}
	
	public void addingTopinngs() {
		System.out.println("Adding Topinngs in Pizza");
	}
	
	public final void addingCheese() {
		System.out.println("Adding Cheese in Pizza");
	}
}
