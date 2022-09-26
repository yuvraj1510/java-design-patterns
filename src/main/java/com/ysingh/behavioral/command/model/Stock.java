package com.ysingh.behavioral.command.model;

public class Stock {
	
	private String stockName = "Google share";
	private int stockQuantity = 30;

	public void buyStock() {
		System.out.println("Stock Name : "+stockName+" and Quantity : "+stockQuantity+" bought");
		
	}
	
	public void sellStock() {
		System.out.println("Stock Name : "+stockName+" and Quantity : "+stockQuantity+" sold");
	}
}
