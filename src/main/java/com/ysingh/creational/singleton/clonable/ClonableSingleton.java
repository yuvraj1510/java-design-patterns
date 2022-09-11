package com.ysingh.creational.singleton.clonable;

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
		throw new CloneNotSupportedException("Cloanning is not supported as this is Singleton!!");
	}

}
