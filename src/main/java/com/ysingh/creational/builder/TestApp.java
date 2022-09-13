package com.ysingh.creational.builder;

public class TestApp {

	public static void main(String[] args) {
		
		Car car1 = new Car.CarBuilder("Red", "Maruti", "4 Wheeler").build();
		System.out.println("CAR1 : "+car1);

		Car car2 = new Car.CarBuilder("Blue", "Tata", "4 Wheeler").withAutomatic(true).build();
		System.out.println("CAR2 : "+car2);
		
		Car car3 = new Car.CarBuilder("White", "Toyota", "4 Wheeler").withAutomatic(true).withElectric(true).build();
		System.out.println("CAR3 : "+car3);
	}

}
