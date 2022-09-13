package com.ysingh.creational.abstractfactory;

public class TestApp {

	public static void main(String[] args) {
		
		Vehicle car = VehicleFactory.getVehicle(new CarFactory("Red", "Maruti", "4 Wheeler", false, false));
		Vehicle bike = VehicleFactory.getVehicle(new BikeFactory("Black", "Honda", "2 Wheeler", true, true));
		Vehicle truck = VehicleFactory.getVehicle(new TruckFactory("Red", "Mahindra", "4 Wheeler", false, false));
		
		System.out.println("CAR : "+car);
		System.out.println("BIKE : "+bike);
		System.out.println("TRUCK : "+truck);

	}

}
