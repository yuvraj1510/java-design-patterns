package com.ysingh.behavioral.visitor.interfaces;

import com.ysingh.behavioral.visitor.interfaces.impl.Book;
import com.ysingh.behavioral.visitor.interfaces.impl.Fruit;

public interface ShoppingCartVisitor {

	public double visit(Book book);
	public double visit(Fruit fruit);
	
}
