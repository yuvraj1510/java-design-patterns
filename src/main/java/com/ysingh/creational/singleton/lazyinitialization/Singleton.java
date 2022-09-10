package com.ysingh.creational.singleton.lazyinitialization;

public class Singleton {
	
	public static Singleton instance = null;
	
	private Singleton() {
		
	}

	/*
	 * This is not thread safe.
	 * It will work in single threaded application but it can be broken in multithreaded environment
	 */
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
