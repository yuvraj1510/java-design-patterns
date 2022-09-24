package com.ysingh.behavioral.observer.interfaces.impl;

import java.util.HashSet;
import java.util.Set;

import com.ysingh.behavioral.observer.Message;
import com.ysingh.behavioral.observer.interfaces.Observer;
import com.ysingh.behavioral.observer.interfaces.Subject;

public class MessagePublisher implements Subject {

	private Set<Observer> observers = new HashSet<>();
	
	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void unsubscribe(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyUpdate(Message message) {
		for(Observer observer : observers) {
			observer.updateObserver(message);
		}
	}	
}
