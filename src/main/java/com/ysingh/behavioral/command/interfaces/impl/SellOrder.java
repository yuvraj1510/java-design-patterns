package com.ysingh.behavioral.command.interfaces.impl;

import com.ysingh.behavioral.command.interfaces.Order;
import com.ysingh.behavioral.command.model.Stock;

public class SellOrder implements Order {

	private Stock stock;
	
	public SellOrder(Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public void execute() {
		stock.sellStock();
	}

}
