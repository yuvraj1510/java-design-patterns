package com.ysingh.structural.bridge.interfaces.impl;

import com.ysingh.structural.bridge.interfaces.Color;

public abstract class Shape {

	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public abstract String draw();

}
