package com.ysingh.creational.singleton.destroy;

public class ClonableSingleton implements Cloneable {
	
	public static ClonableSingleton instance = null;
	
	private ClonableSingleton() {
		
	}

	public static ClonableSingleton getInstance() {
		if(instance == null) {
			instance = new ClonableSingleton();
		}
		return instance;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
