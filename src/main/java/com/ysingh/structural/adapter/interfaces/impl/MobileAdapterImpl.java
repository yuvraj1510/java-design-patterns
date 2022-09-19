package com.ysingh.structural.adapter.interfaces.impl;

import com.ysingh.structural.adapter.interfaces.MobileAdapter;
import com.ysingh.structural.adapter.interfaces.WallSocket;
import com.ysingh.structural.adapter.models.Volt;

public class MobileAdapterImpl implements MobileAdapter {

	private WallSocket wallSocket;
	
	public MobileAdapterImpl(WallSocket wallSocket) {
		this.wallSocket = wallSocket;
	}

	@Override
	public Volt get3Volt() {
		
		Volt v240 = wallSocket.getVolts();
		int v3 = v240.getVolts()/80;
		
		return new Volt(v3);
	}

}
