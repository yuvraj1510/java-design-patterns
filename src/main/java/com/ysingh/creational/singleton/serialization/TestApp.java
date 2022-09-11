package com.ysingh.creational.singleton.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestApp {

	public static void main(String[] args) throws IOException {
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
}
