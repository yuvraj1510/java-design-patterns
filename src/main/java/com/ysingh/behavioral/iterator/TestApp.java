package com.ysingh.behavioral.iterator;

import com.ysingh.behavioral.iterator.interfaces.Collection;
import com.ysingh.behavioral.iterator.interfaces.CollectionImpl;
import com.ysingh.behavioral.iterator.interfaces.Iterator;

public class TestApp {

	public static void main(String[] args) {
		
		Collection collection = new CollectionImpl();
		
		Iterator iterator = collection.getIterator();
		
		while(iterator.hasNext()) {
			Object object = iterator.next();
			String name = (String)object;
			System.out.println("Name : "+name);
		}
		
	}

}
