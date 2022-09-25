package com.ysingh.behavioral.interpreter.interfaces;

import com.ysingh.behavioral.interpreter.engine.InterpreterEngine;

public interface Expression {
	
	public abstract int interpret(InterpreterEngine interpreterEngine);

}
