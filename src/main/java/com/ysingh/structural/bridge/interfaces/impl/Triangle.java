package com.ysingh.structural.bridge.interfaces.impl;

import com.ysingh.structural.bridge.interfaces.Color;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "Triangle drawn with color "+color.fill();
	}

}
