package com.ysingh.behavioral.state.interfaces.impl;

import com.ysingh.behavioral.state.interfaces.State;

public class ACContext implements State {

	private State state;
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	@Override
	public void doAction() {
		state.doAction();
	}

}
