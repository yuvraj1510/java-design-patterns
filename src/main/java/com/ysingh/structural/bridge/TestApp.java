package com.ysingh.structural.bridge;

import com.ysingh.structural.bridge.interfaces.impl.Blue;
import com.ysingh.structural.bridge.interfaces.impl.Rectangle;
import com.ysingh.structural.bridge.interfaces.impl.Red;
import com.ysingh.structural.bridge.interfaces.impl.Shape;
import com.ysingh.structural.bridge.interfaces.impl.Square;

public class TestApp {

	public static void main(String[] args) {
		
		Shape square = new Square(new Blue());
		System.out.println(square.draw());
		
		System.out.println("----------------------------");
		
		Shape rectangle = new Rectangle(new Red());
		System.out.println(rectangle.draw());

	}

}
