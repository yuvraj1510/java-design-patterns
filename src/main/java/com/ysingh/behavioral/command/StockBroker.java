package com.ysingh.behavioral.command;

import java.util.ArrayList;
import java.util.List;

import com.ysingh.behavioral.command.interfaces.Order;

public class StockBroker {
	
	private List<Order> orderList = null;
	
	public StockBroker() {
		this.orderList = new ArrayList<>();
	}
	
	public void placeOrder(Order order) {
		orderList.add(order);
	}
	
	public void executeOrders() {
		for(Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}

}
