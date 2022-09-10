package com.ysingh.creational.singleton.eagerinitialization;

public class Singleton {
	
	private static final Singleton instance = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return instance;
	}

}
