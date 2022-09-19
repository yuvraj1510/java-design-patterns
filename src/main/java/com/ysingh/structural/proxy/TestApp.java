package com.ysingh.structural.proxy;

import com.ysingh.structural.proxy.interfaces.VeryExpensiveProcess;
import com.ysingh.structural.proxy.interfaces.impl.VeryExpensiveProcessProxy;

public class TestApp {

	public static void main(String[] args) {
		
		VeryExpensiveProcess veryExpensiveProcess = new VeryExpensiveProcessProxy();
		veryExpensiveProcess.process();
		veryExpensiveProcess.process();

	}

}
