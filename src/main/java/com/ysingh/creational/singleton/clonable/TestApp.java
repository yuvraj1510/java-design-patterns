package com.ysingh.creational.singleton.clonable;

public class TestApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		ClonableSingleton instance1 = ClonableSingleton.getInstance();
		ClonableSingleton instance2 = (ClonableSingleton) instance1.clone();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}	
}
