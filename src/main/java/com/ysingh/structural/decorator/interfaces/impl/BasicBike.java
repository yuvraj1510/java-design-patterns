package com.ysingh.structural.decorator.interfaces.impl;

import com.ysingh.structural.decorator.interfaces.Bike;

public class BasicBike implements Bike {

	@Override
	public void assembleBike() {
		System.out.println("Basic Bike Assembled");
	}

}
