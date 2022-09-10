package com.ysingh.creational.singleton.eagerinitialization;

public class TestApp {

	public static void main(String[] args) {
		
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

	}

}
