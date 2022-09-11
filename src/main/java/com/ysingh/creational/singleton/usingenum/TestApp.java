package com.ysingh.creational.singleton.usingenum;

public class TestApp {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.GETINSTANCE;
		Singleton instance2 = Singleton.GETINSTANCE;
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

		System.out.println(instance1.test());		
	}

}
