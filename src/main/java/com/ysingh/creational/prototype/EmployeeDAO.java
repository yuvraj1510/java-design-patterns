package com.ysingh.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements Cloneable {
	
	private static List<Employee> employees = null;
	static {
		employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.setId(10);
		employee.setName("Yuvraj Singh");
		employees.add(employee);
		
		employee = new Employee();
		employee.setId(20);
		employee.setName("Sonu Singh");
		employees.add(employee);
	}
	
	public List<Employee> getAllEmployees() {
		return employees;
	}
	
	@Override
	public List<Employee> clone() throws CloneNotSupportedException {
		List<Employee> clonnedList = new ArrayList<>();
		for(Employee employee : employees) {
			clonnedList.add(employee);
		}
		return clonnedList;
	}

}
