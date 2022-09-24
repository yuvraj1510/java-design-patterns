package com.ysingh.behavioral.observer.interfaces.impl;

import com.ysingh.behavioral.observer.Message;
import com.ysingh.behavioral.observer.interfaces.Observer;

public class FirstMessageSubscriber implements Observer {

	@Override
	public void updateObserver(Message message) {
		System.out.println("Message for first subscriber : "+message.getMessage());
	}

}
