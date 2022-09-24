package com.ysingh.behavioral.cor;

import com.ysingh.behavioral.cor.interfaces.MoneyDispenser;
import com.ysingh.behavioral.cor.interfaces.impl.Dispense100Rupees;
import com.ysingh.behavioral.cor.interfaces.impl.Dispense2000Rupees;
import com.ysingh.behavioral.cor.interfaces.impl.Dispense200Rupees;
import com.ysingh.behavioral.cor.interfaces.impl.Dispense500Rupees;

public class ATMMachineDispenseChain {

	private MoneyDispenser moneyDispenser1;
	
	public ATMMachineDispenseChain() {
		moneyDispenser1 = new Dispense2000Rupees();
		MoneyDispenser moneyDispenser2 = new Dispense500Rupees();
		MoneyDispenser moneyDispenser3 = new Dispense200Rupees();
		MoneyDispenser moneyDispenser4 = new Dispense100Rupees();
		
		moneyDispenser1.setNextChain(moneyDispenser2);
		moneyDispenser2.setNextChain(moneyDispenser3);
		moneyDispenser3.setNextChain(moneyDispenser4);
	}

	public MoneyDispenser getMoneyDispenser1() {
		return moneyDispenser1;
	}	
}
