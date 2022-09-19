package com.ysingh.structural.decorator.interfaces.impl;

import com.ysingh.structural.decorator.interfaces.Bike;

public class LuxuryBike extends BikeDecorator {

	public LuxuryBike(Bike bike) {
		super(bike);
	}
	
	public void assembleBike() {
		super.assembleBike();
		System.out.println("Adding Luxury Feature in Bike!!!");
	}

}
