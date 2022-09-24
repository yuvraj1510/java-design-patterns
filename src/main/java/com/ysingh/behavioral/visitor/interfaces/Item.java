package com.ysingh.behavioral.visitor.interfaces;

public interface Item {

	public double accept(ShoppingCartVisitor visitor);
}
