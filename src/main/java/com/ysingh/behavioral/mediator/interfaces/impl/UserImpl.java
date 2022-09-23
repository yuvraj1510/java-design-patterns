package com.ysingh.behavioral.mediator.interfaces.impl;

import com.ysingh.behavioral.mediator.interfaces.ChatMediator;
import com.ysingh.behavioral.mediator.interfaces.User;

public class UserImpl extends User {

	private ChatMediator chatMediator;
	private String userName;
	
	public UserImpl(ChatMediator chatMediator, String userName) {
		super(chatMediator, userName);
		this.chatMediator = chatMediator;
		this.userName = userName;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println(userName + " - Sending Message = "+ message);
		chatMediator.sendMessage(message, this);

	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(userName + " - Received Message = "+ message);
	}

}
