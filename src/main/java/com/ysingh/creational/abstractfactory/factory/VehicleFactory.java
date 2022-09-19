
package com.ysingh.creational.abstractfactory.factory;

import com.ysingh.creational.abstractfactory.interfaces.Vehicle;

public class VehicleFactory {

	private VehicleFactory() {
		
	}
	
	public static Vehicle getVehicle(AbstractVehicleFactory abstractVehicleFactory) {
		return abstractVehicleFactory.createVehicle();
	}
}
