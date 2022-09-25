package com.ysingh.behavioral.interpreter.engine;

public class InterpreterEngine {
	
	public int addition(String inputData) {
		String[] tokens = interpret(inputData);
		int num1 = Integer.parseInt(tokens[0]);
		int num2 = Integer.parseInt(tokens[1]);
		return num1 + num2;
	}
	
	public int subtraction(String inputData) {
		String[] tokens = interpret(inputData);
		int num1 = Integer.parseInt(tokens[0]);
		int num2 = Integer.parseInt(tokens[1]);
		return num2 - num1;
	}

	private String[] interpret(String inputData) {
		String tempInputData = inputData.replaceAll("[^0-9]", " ");
		tempInputData = tempInputData.replaceAll("( )+", " ").trim();
		return tempInputData.split(" ");
	}
}
