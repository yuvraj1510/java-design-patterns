package com.ysingh.structural.composite.component.leaf;

import com.ysingh.structural.composite.component.Service;

public class EmployeeService implements Service {

	@Override
	public void service(String serviceType) {
		System.out.println(serviceType + " for Employee");

	}

}
