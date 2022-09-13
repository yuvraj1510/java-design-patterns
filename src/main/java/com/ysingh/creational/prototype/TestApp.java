package com.ysingh.creational.prototype;

import java.util.List;

public class TestApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<Employee> employees = employeeDAO.getAllEmployees();
		
		System.out.println("Original Employee List:");
		employees.forEach(System.out::println);
		
		List<Employee> updatedEmployees = employeeDAO.clone();
		Employee employee = new Employee();
		employee.setId(30);
		employee.setName("Yuvi Singh");
		updatedEmployees.add(employee);
		
		System.out.println("Updated Employee List:");
		updatedEmployees.forEach(System.out::println);	
		
	}

}
