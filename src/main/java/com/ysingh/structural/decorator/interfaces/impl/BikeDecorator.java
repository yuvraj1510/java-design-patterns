package com.ysingh.structural.decorator.interfaces.impl;

import com.ysingh.structural.decorator.interfaces.Bike;

public class BikeDecorator implements Bike {

	private Bike bike;
	
	public BikeDecorator(Bike bike) {
		this.bike = bike;
	}

	@Override
	public void assembleBike() {
		bike.assembleBike();		
	}
	
}
