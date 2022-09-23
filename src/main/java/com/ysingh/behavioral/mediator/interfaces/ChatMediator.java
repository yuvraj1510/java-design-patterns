package com.ysingh.behavioral.mediator.interfaces;

public interface ChatMediator {

	public abstract void sendMessage(String message, User user);
	public abstract void addUser(User user);
	
}
