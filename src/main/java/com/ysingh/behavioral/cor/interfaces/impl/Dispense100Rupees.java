package com.ysingh.behavioral.cor.interfaces.impl;

import com.ysingh.behavioral.cor.interfaces.MoneyDispenser;
import com.ysingh.behavioral.cor.model.Currency;

public class Dispense100Rupees implements MoneyDispenser {
	
	private MoneyDispenser moneyDispenser;

	@Override
	public void setNextChain(MoneyDispenser moneyDispenser) {
		this.moneyDispenser = moneyDispenser;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= 100) {
			int numberOfNotes = currency.getAmount()/100;
			System.out.println("Dispensing " + numberOfNotes + " note(s) of 100");
			int remainder = currency.getAmount()%100;
			
			if(remainder != 0) {
				moneyDispenser.dispense(new Currency(remainder));
			}
		} else {
			moneyDispenser.dispense(currency);
		}

	}

}
