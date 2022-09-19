package com.ysingh.creational.factory;

import com.ysingh.creational.factory.interfaces.Vehicle;
import com.ysingh.creational.factory.interfaces.impl.Bike;
import com.ysingh.creational.factory.interfaces.impl.Car;
import com.ysingh.creational.factory.interfaces.impl.Truck;

public class VehicleFactory {

	private VehicleFactory() {
		
	}
	
	public static Vehicle getVehicle(VehicleType vehicleType, String color, String company, String type, boolean isElectric, boolean isAutomatic) {
		
		switch(vehicleType) {
		case BIKE:
			return new Bike(color, company, type, isElectric, isAutomatic);
		case TRUCK:
			return new Truck(color, company, type, isElectric, isAutomatic);
		case CAR:
			return new Car(color, company, type, isElectric, isAutomatic);
		default:
			throw new RuntimeException("Invalid Vehicle Type for Factory");
		}
		
	}
}
