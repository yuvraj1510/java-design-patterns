package com.ysingh.behavioral.observer.interfaces;

import com.ysingh.behavioral.observer.Message;

public interface Subject {

	public void subscribe(Observer observer);
	public void unsubscribe(Observer observer);
	public void notifyUpdate(Message message);
}
