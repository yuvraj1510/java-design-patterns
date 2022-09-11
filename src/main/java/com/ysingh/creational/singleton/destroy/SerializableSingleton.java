package com.ysingh.creational.singleton.destroy;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static SerializableSingleton instance = null;
	
	private SerializableSingleton() {
		
	}
	
	public static SerializableSingleton getInstance() {
		if(instance == null) {
			instance = new SerializableSingleton();
		}
		return instance;
	}
	

}
