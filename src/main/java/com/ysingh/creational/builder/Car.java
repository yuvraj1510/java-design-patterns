package com.ysingh.creational.builder;

public class Car {

	private String color;
	private String company;
	private String type;
	
	private boolean isElectric;
	private boolean isAutomatic;
	
	private Car(CarBuilder builder) {
		this.color = builder.color;
		this.company = builder.company;
		this.type = builder.type;
		this.isAutomatic = builder.isAutomatic;
		this.isElectric = builder.isElectric;
	}
	
	public String getColor() {
		return color;
	}
	public String getCompany() {
		return company;
	}
	public String getType() {
		return type;
	}
	public boolean isElectric() {
		return isElectric;
	}
	public boolean isAutomatic() {
		return isAutomatic;
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", company=" + company + ", type=" + type + ", isElectric=" + isElectric
				+ ", isAutomatic=" + isAutomatic + "]";
	}

	public static class CarBuilder {
		private String color;
		private String company;
		private String type;
		
		private boolean isElectric;
		private boolean isAutomatic;
		
		public CarBuilder(String color, String company, String type) {
			this.color = color;
			this.company = company;
			this.type = type;
		}

		public CarBuilder withElectric(boolean isElectric) {
			this.isElectric = isElectric;
			return this;
		}

		public CarBuilder withAutomatic(boolean isAutomatic) {
			this.isAutomatic = isAutomatic;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
	}
	
}
