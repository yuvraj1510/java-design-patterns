package com.ysingh.creational.factory;

import com.ysingh.creational.factory.interfaces.Vehicle;

public class TestApp {

	public static void main(String[] args) {
		
		Vehicle car = VehicleFactory.getVehicle(VehicleType.CAR, "Red", "Maruti", "4 Wheeler", true, true);
		System.out.println("CAR : "+car);
		
		Vehicle bike = VehicleFactory.getVehicle(VehicleType.BIKE, "Black", "Honda", "2 Wheeler", false, false);
		System.out.println("BIKE : "+bike);
		
		Vehicle truck = VehicleFactory.getVehicle(VehicleType.TRUCK, "Red", "Mahindra", "4 Wheeler", false, false);
		System.out.println("TRUCK : "+truck);

	}

}
