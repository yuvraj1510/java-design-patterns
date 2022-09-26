package com.ysingh.behavioral.interpreter.interfaces.impl;

import com.ysingh.behavioral.interpreter.engine.InterpreterEngine;
import com.ysingh.behavioral.interpreter.interfaces.Expression;

public class AdditionExpression implements Expression {

	private String expression;
	
	public AdditionExpression(String expression) {
		this.expression = expression;
	}
	
	@Override
	public int interpret(InterpreterEngine interpreterEngine) {
		return interpreterEngine.addition(expression);
	}

}
