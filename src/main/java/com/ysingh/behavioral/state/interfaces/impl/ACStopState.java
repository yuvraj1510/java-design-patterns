package com.ysingh.behavioral.state.interfaces.impl;

import com.ysingh.behavioral.state.interfaces.State;

public class ACStopState implements State {

	@Override
	public void doAction() {
		System.out.println("AC Turned OFF");
	}

}
