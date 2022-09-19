package com.ysingh.creational.abstractfactory.interfaces;

public interface Vehicle {
	
	public abstract String color();
	public abstract String company();
	public abstract String type();
	
	public boolean isAutomatic();
	public boolean isElectric();

}
