package com.ysingh.behavioral.cor.interfaces;

import com.ysingh.behavioral.cor.model.Currency;

public interface MoneyDispenser {

	public abstract void setNextChain(MoneyDispenser moneyDispenser);
	public abstract void dispense(Currency curreny);
}
