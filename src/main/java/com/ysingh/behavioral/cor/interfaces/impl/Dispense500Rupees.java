package com.ysingh.behavioral.cor.interfaces.impl;

import com.ysingh.behavioral.cor.interfaces.MoneyDispenser;
import com.ysingh.behavioral.cor.model.Currency;

public class Dispense500Rupees implements MoneyDispenser {
	
	private MoneyDispenser moneyDispenser;

	@Override
	public void setNextChain(MoneyDispenser moneyDispenser) {
		this.moneyDispenser = moneyDispenser;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= 500) {
			int numberOfNotes = currency.getAmount()/500;
			System.out.println("Dispensing " + numberOfNotes + " note(s) of 500");
			int remainder = currency.getAmount()%500;
			
			if(remainder != 0) {
				moneyDispenser.dispense(new Currency(remainder));
			}
		} else {
			moneyDispenser.dispense(currency);
		}

	}

}
