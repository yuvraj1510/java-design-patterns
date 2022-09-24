package com.ysingh.behavioral.cor;

import java.util.Scanner;

import com.ysingh.behavioral.cor.model.Currency;

public class TestApp {

	public static void main(String[] args) {
		
		ATMMachineDispenseChain atmMachineDispenseChain = new ATMMachineDispenseChain();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the amount to dispense");
		
		int amount = sc.nextInt();
		
		sc.close();
		
		if(amount % 100 != 0) {
			System.out.println("Amount should be multiple of 100s");
		} else {
			atmMachineDispenseChain.getMoneyDispenser1().dispense(new Currency(amount));
		}
		
	}

}
