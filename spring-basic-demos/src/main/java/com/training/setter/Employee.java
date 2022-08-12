package com.training.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //the IOC container will create the object
public class Employee {
	private String name;
	private int employeeId;
	private double salary;
	
	private Adress address;
	
	public Adress getAddress() {
		return address;
	}
	@Autowired
	
	public void setAddress(Adress address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	@Value("${employee.name}")
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	@Value("${employee.employeeId}")
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	@Value("${employee.salary}")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + ", address=" + address
				+ "]";
	}
	
	
}
