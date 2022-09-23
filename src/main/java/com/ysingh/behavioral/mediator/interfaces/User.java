package com.ysingh.behavioral.mediator.interfaces;

public abstract class User {

	private ChatMediator chatMediator;
	private String userName;
	
	public User(ChatMediator chatMediator, String userName) {
		this.chatMediator = chatMediator;
		this.userName = userName;
	}

	public ChatMediator getChatMediator() {
		return chatMediator;
	}

	public String getUserName() {
		return userName;
	}
	
	public abstract void sendMessage(String message);
	public abstract void receiveMessage(String message);
}
