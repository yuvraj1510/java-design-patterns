package com.ysingh.behavioral.strategy.interfaces.impl;

import com.ysingh.behavioral.strategy.interfaces.PaymentMethod;

public class PayPalPaymentMethod implements PaymentMethod {

	private String email;
	private String password;
	
	public PayPalPaymentMethod(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " is paid using PayPal");
	}

}
