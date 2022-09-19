package com.ysingh.structural.adapter;

public class TestApp {

	public static void main(String[] args) {
		
		WallSocket wallSocket = new WallSocketImpl();
		System.out.println("WallSocket Voltage : "+wallSocket.getVolts());
		
		MobileAdapter mobileAdapter = new MobileAdapterImpl(wallSocket);
		System.out.println("Mobile Voltage : "+mobileAdapter.get3Volt());

	}

}
