package com.ysingh.behavioral.observer.interfaces.impl;

import com.ysingh.behavioral.observer.Message;
import com.ysingh.behavioral.observer.interfaces.Observer;

public class ThirdMessageSubscriber implements Observer {

	@Override
	public void updateObserver(Message message) {
		System.out.println("Message for Third subscriber : "+message.getMessage());
	}

}
