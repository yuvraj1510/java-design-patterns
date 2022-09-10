package com.ysingh.creational.singleton.threadsafe;

public class Singleton {
	
	public static Singleton instance = null;
	
	private Singleton() {
		
	}

	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}
