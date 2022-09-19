package com.ysingh.structural.composite;

import com.ysingh.structural.composite.component.Service;
import com.ysingh.structural.composite.component.leaf.AdminService;
import com.ysingh.structural.composite.component.leaf.EmployeeService;

public class TestApp {

	public static void main(String[] args) {
		
		Service employeeService1 = new EmployeeService();
		Service employeeService2 = new EmployeeService();
		
		Service adminService = new AdminService();
		
		ServiceProvider provider = new ServiceProvider();
		
		provider.addService(employeeService1);
		provider.addService(employeeService2);
		provider.addService(adminService);
		
		provider.service("Registration Service");
		
		provider.removeService(employeeService1);
		provider.addService(new AdminService());
		
		System.out.println("------------------------------");
		provider.service("Logout Service");
		
		provider.clearServices();
		provider.addService(new EmployeeService());
		System.out.println("------------------------------");
		provider.service("Update Service");
	}

}
