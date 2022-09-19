package com.ysingh.structural.decorator;

import com.ysingh.structural.decorator.interfaces.Bike;
import com.ysingh.structural.decorator.interfaces.impl.BasicBike;
import com.ysingh.structural.decorator.interfaces.impl.LuxuryBike;
import com.ysingh.structural.decorator.interfaces.impl.SportBike;

public class TestApp {

	public static void main(String[] args) {
		
		Bike basicBike = new BasicBike();
		basicBike.assembleBike();
		System.out.println("-------------------------------------");
		
		Bike sportBike = new SportBike(basicBike);
		sportBike.assembleBike();
		
		System.out.println("-------------------------------------");
		Bike sportsLuxuryBike = new SportBike(new LuxuryBike(new BasicBike()));
		sportsLuxuryBike.assembleBike();

	}

}
