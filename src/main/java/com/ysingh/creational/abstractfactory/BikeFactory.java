package com.ysingh.creational.abstractfactory;

public class BikeFactory implements AbstractVehicleFactory {

	private String color;
	private String company;
	private String type;
	private boolean isElectric;
	private boolean isAutomatic;
	
	public BikeFactory(String color, String company, String type, boolean isElectric, boolean isAutomatic) {
		super();
		this.color = color;
		this.company = company;
		this.type = type;
		this.isElectric = isElectric;
		this.isAutomatic = isAutomatic;
	}
	
	@Override
	public Vehicle createVehicle() {
		return new Bike(color, company, type, isElectric, isAutomatic);
	}

}
