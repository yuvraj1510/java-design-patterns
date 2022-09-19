package com.ysingh.structural.proxy.interfaces.impl;

import com.ysingh.structural.proxy.interfaces.VeryExpensiveProcess;

public class VeryExpensiveProcessProxy implements VeryExpensiveProcess {
	
	private static VeryExpensiveProcess veryExpensiveProcessObject;

	@Override
	public void process() {
		if(veryExpensiveProcessObject == null) {
			veryExpensiveProcessObject = new VeryExpensiveProcessImpl();
		}

		veryExpensiveProcessObject.process();
	}

}
