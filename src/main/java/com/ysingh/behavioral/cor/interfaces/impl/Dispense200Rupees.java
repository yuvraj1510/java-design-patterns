package com.ysingh.behavioral.cor.interfaces.impl;

import com.ysingh.behavioral.cor.interfaces.MoneyDispenser;
import com.ysingh.behavioral.cor.model.Currency;

public class Dispense200Rupees implements MoneyDispenser {
	
	private MoneyDispenser moneyDispenser;

	@Override
	public void setNextChain(MoneyDispenser moneyDispenser) {
		this.moneyDispenser = moneyDispenser;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= 200) {
			int numberOfNotes = currency.getAmount()/200;
			System.out.println("Dispensing " + numberOfNotes + " note(s) of 200");
			int remainder = currency.getAmount()%200;
			
			if(remainder != 0) {
				moneyDispenser.dispense(new Currency(remainder));
			}
		} else {
			moneyDispenser.dispense(currency);
		}

	}

}
