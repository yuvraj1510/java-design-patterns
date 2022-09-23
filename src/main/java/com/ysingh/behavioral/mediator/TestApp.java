package com.ysingh.behavioral.mediator;

import com.ysingh.behavioral.mediator.interfaces.ChatMediator;
import com.ysingh.behavioral.mediator.interfaces.User;
import com.ysingh.behavioral.mediator.interfaces.impl.ChatMediatorImpl;
import com.ysingh.behavioral.mediator.interfaces.impl.UserImpl;

public class TestApp {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediatorImpl();
		
		User user1 = new UserImpl(chatMediator, "USER1");
		User user2 = new UserImpl(chatMediator, "USER2");
		User user3 = new UserImpl(chatMediator, "USER3");
		User user4 = new UserImpl(chatMediator, "USER4");
		User user5 = new UserImpl(chatMediator, "USER5");
		
		chatMediator.addUser(user1);
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		chatMediator.addUser(user4);
		chatMediator.addUser(user5);
		
		user2.sendMessage("Hi All");

	}

}
