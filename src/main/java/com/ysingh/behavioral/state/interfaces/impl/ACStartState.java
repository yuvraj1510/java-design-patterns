package com.ysingh.behavioral.state.interfaces.impl;

import com.ysingh.behavioral.state.interfaces.State;

public class ACStartState implements State {

	@Override
	public void doAction() {
		System.out.println("AC Turned ON");
	}

}
