package com.ysingh.creational.singleton.staticinitialization;

public class Singleton {
	
	private static Singleton instance = null;

	private Singleton() {
		
	}
	
	static {
		try {
			if(instance == null) {
				instance = new Singleton();
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
