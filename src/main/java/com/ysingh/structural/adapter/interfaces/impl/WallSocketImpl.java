package com.ysingh.structural.adapter.interfaces.impl;

import com.ysingh.structural.adapter.interfaces.WallSocket;
import com.ysingh.structural.adapter.models.Volt;

public class WallSocketImpl implements WallSocket {

	@Override
	public Volt getVolts() {
		return new Volt(240);
	}

}
