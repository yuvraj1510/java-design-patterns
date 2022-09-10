package com.ysingh.creational.singleton.threadsafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestApp {

	public static void main(String[] args) {
		
		ExecutorService executorService = null;
		MyThread myThread = new MyThread();
		try {
			executorService = Executors.newFixedThreadPool(5);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);			
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if(executorService != null) {
				executorService.shutdown();
			}
		}

	}

}
