package com.ysingh.structural.decorator.interfaces.impl;

import com.ysingh.structural.decorator.interfaces.Bike;

public class SportBike extends BikeDecorator {

	public SportBike(Bike bike) {
		super(bike);
	}
	
	public void assembleBike() {
		super.assembleBike();
		System.out.println("Adding Sports Feature in Bike!!!");
	}

}
