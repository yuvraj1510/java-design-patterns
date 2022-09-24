package com.ysingh.behavioral.cor.interfaces.impl;

import com.ysingh.behavioral.cor.interfaces.MoneyDispenser;
import com.ysingh.behavioral.cor.model.Currency;

public class Dispense2000Rupees implements MoneyDispenser {
	
	private MoneyDispenser moneyDispenser;

	@Override
	public void setNextChain(MoneyDispenser moneyDispenser) {
		this.moneyDispenser = moneyDispenser;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= 2000) {
			int numberOfNotes = currency.getAmount()/2000;
			System.out.println("Dispensing " + numberOfNotes + " note(s) of 2000");
			int remainder = currency.getAmount()%2000;
			
			if(remainder != 0) {
				moneyDispenser.dispense(new Currency(remainder));
			}
		} else {
			moneyDispenser.dispense(currency);
		}

	}

}
