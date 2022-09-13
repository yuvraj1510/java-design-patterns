package com.ysingh.creational.factory;

public class Truck implements Vehicle {

	private String color;
	private String company;
	private String type;
	private boolean isElectric;
	private boolean isAutomatic;
	
	public Truck(String color, String company, String type, boolean isElectric, boolean isAutomatic) {
		super();
		this.color = color;
		this.company = company;
		this.type = type;
		this.isElectric = isElectric;
		this.isAutomatic = isAutomatic;
	}

	public String color() {
		return this.color;
	}

	public String company() {
		return this.company;
	}

	public String type() {
		return this.type;
	}

	public boolean isAutomatic() {
		return this.isAutomatic;
	}

	public boolean isElectric() {
		return this.isElectric;
	}

	@Override
	public String toString() {
		return "Truck [color=" + color + ", company=" + company + ", type=" + type + ", isElectric=" + isElectric
				+ ", isAutomatic=" + isAutomatic + "]";
	}

}
