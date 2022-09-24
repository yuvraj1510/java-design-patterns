package com.ysingh.behavioral.state;

import com.ysingh.behavioral.state.interfaces.impl.ACContext;
import com.ysingh.behavioral.state.interfaces.impl.ACStartState;
import com.ysingh.behavioral.state.interfaces.impl.ACStopState;

public class TestApp {

	public static void main(String[] args) {
		ACContext acContext = new ACContext();
		
		acContext.setState(new ACStartState());
		acContext.doAction();
		
		acContext.setState(new ACStopState());
		acContext.doAction();
	}

}
