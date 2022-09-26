package com.ysingh.behavioral.command;

import com.ysingh.behavioral.command.interfaces.Order;
import com.ysingh.behavioral.command.interfaces.impl.BuyOrder;
import com.ysingh.behavioral.command.interfaces.impl.SellOrder;
import com.ysingh.behavioral.command.model.Stock;

public class TestApp {

	public static void main(String[] args) {
		Stock stock = new Stock();
		
		Order buyOrder = new BuyOrder(stock);
		Order sellOrder = new SellOrder(stock);
		
		StockBroker stockBroker = new StockBroker();
		stockBroker.placeOrder(buyOrder);
		stockBroker.placeOrder(sellOrder);
		
		stockBroker.executeOrders();
	}

}
