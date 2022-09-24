package com.ysingh.behavioral.observer;

import com.ysingh.behavioral.observer.interfaces.Subject;
import com.ysingh.behavioral.observer.interfaces.impl.FirstMessageSubscriber;
import com.ysingh.behavioral.observer.interfaces.impl.MessagePublisher;
import com.ysingh.behavioral.observer.interfaces.impl.SecondMessageSubscriber;
import com.ysingh.behavioral.observer.interfaces.impl.ThirdMessageSubscriber;

public class TestApp {

	public static void main(String[] args) {
		FirstMessageSubscriber firstMessageSubscriber = new FirstMessageSubscriber();
		SecondMessageSubscriber secondMessageSubscriber = new SecondMessageSubscriber();
		ThirdMessageSubscriber thirdMessageSubscriber = new ThirdMessageSubscriber();
		
		Subject subject = new MessagePublisher();
		
		subject.subscribe(firstMessageSubscriber);
		subject.subscribe(secondMessageSubscriber);
		
		subject.notifyUpdate(new Message("This is first message!!!"));
		
		System.out.println("--------------------------------------------");
		
		subject.unsubscribe(firstMessageSubscriber);
		subject.subscribe(thirdMessageSubscriber);
		
		subject.notifyUpdate(new Message("This is second message!!!"));

	}

}
