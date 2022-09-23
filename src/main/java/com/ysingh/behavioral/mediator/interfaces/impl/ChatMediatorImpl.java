package com.ysingh.behavioral.mediator.interfaces.impl;

import java.util.ArrayList;
import java.util.List;

import com.ysingh.behavioral.mediator.interfaces.ChatMediator;
import com.ysingh.behavioral.mediator.interfaces.User;

public class ChatMediatorImpl implements ChatMediator {

	private List<User> userList;
	
	public ChatMediatorImpl() {
		userList = new ArrayList<>();
	}
	
	@Override
	public void sendMessage(String message, User user) {
		for(User usr : userList) {
			if(!usr.getUserName().equalsIgnoreCase(user.getUserName())) {
				usr.receiveMessage(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		userList.add(user);
	}

}
