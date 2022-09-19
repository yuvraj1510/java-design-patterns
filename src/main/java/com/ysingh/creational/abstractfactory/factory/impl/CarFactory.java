package com.ysingh.creational.abstractfactory.factory.impl;

import com.ysingh.creational.abstractfactory.factory.AbstractVehicleFactory;
import com.ysingh.creational.abstractfactory.interfaces.Vehicle;
import com.ysingh.creational.abstractfactory.interfaces.impl.Car;

public class CarFactory implements AbstractVehicleFactory {

	private String color;
	private String company;
	private String type;
	private boolean isElectric;
	private boolean isAutomatic;
	
	public CarFactory(String color, String company, String type, boolean isElectric, boolean isAutomatic) {
		super();
		this.color = color;
		this.company = company;
		this.type = type;
		this.isElectric = isElectric;
		this.isAutomatic = isAutomatic;
	}
	
	@Override
	public Vehicle createVehicle() {
		return new Car(color, company, type, isElectric, isAutomatic);
	}

}
