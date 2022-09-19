package com.ysingh.structural.adapter;

public class WallSocketImpl implements WallSocket {

	@Override
	public Volt getVolts() {
		return new Volt(240);
	}

}
