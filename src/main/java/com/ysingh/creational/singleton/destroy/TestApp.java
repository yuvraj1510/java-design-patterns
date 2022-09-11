package com.ysingh.creational.singleton.destroy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestApp {

	public static void main(String[] args) {
		System.out.println("Using Reflection: ");
		try {
			usingReflection();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println();
		System.out.println("Using Serialization: ");
		try {
			usingSerialization();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println();
		System.out.println("Using Clonable: ");
		try {
			usingClonable();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	private static void usingReflection() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = null;
		
		Constructor<?>[] declaredConstructors = Singleton.class.getDeclaredConstructors();
		for(Constructor<?> declaredConstructor : declaredConstructors) {
			declaredConstructor.setAccessible(true);
			instance2 = (Singleton)declaredConstructor.newInstance();
			break;
		}
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
	
	private static void usingSerialization() throws IOException {
		
		SerializableSingleton instance1 = SerializableSingleton.getInstance();
		SerializableSingleton instance2 = null;
		
		ObjectOutput objectOutput = null;
		
		try {
			objectOutput = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
			objectOutput.writeObject(instance1);
			objectOutput.flush();
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if(objectOutput != null) {
				objectOutput.close();
			}
		}
		
		ObjectInput objectInput = null;
		
		try {
			objectInput = new ObjectInputStream(new FileInputStream("singleton.ser"));
			instance2 = (SerializableSingleton)objectInput.readObject();
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if(objectInput != null) {
				objectInput.close();
			}
		}
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
	}
	
	private static void usingClonable() throws CloneNotSupportedException {
		ClonableSingleton instance1 = ClonableSingleton.getInstance();
		ClonableSingleton instance2 = (ClonableSingleton) instance1.clone();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}
