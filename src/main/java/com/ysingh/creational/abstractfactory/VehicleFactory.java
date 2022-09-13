
package com.ysingh.creational.abstractfactory;

public class VehicleFactory {

	private VehicleFactory() {
		
	}
	
	public static Vehicle getVehicle(AbstractVehicleFactory abstractVehicleFactory) {
		return abstractVehicleFactory.createVehicle();
	}
}
