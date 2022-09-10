package com.ysingh.creational.singleton.threadsafe;

public class MyThread implements Runnable {

	public void run() {
		Singleton instance = Singleton.getInstance();
		
		System.out.println(Thread.currentThread().getName() + " " + instance.hashCode());

	}

}
