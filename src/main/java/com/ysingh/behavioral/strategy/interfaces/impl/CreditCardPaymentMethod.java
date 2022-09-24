package com.ysingh.behavioral.strategy.interfaces.impl;

import com.ysingh.behavioral.strategy.interfaces.PaymentMethod;

public class CreditCardPaymentMethod implements PaymentMethod {

	private String cardNumber;
	private String cvv;
	private String cardHolderName;
	private String dateOfExpiry;
	
	public CreditCardPaymentMethod(String cardNumber, String cvv, String cardHolderName, String dateOfExpiry) {
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.cardHolderName = cardHolderName;
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " is paid using card: " + cardNumber);
	}

}
