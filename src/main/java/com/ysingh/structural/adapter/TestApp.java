package com.ysingh.structural.adapter;

import com.ysingh.structural.adapter.interfaces.MobileAdapter;
import com.ysingh.structural.adapter.interfaces.WallSocket;
import com.ysingh.structural.adapter.interfaces.impl.MobileAdapterImpl;
import com.ysingh.structural.adapter.interfaces.impl.WallSocketImpl;

public class TestApp {

	public static void main(String[] args) {
		
		WallSocket wallSocket = new WallSocketImpl();
		System.out.println("WallSocket Voltage : "+wallSocket.getVolts());
		
		MobileAdapter mobileAdapter = new MobileAdapterImpl(wallSocket);
		System.out.println("Mobile Voltage : "+mobileAdapter.get3Volt());

	}

}
