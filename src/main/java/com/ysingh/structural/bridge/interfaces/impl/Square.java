package com.ysingh.structural.bridge.interfaces.impl;

import com.ysingh.structural.bridge.interfaces.Color;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "Square drawn with color "+color.fill();
	}


}
