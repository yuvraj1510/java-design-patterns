package com.ysingh.structural.bridge.interfaces.impl;

import com.ysingh.structural.bridge.interfaces.Color;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "Rectangle drawn with color "+color.fill();
	}

}
