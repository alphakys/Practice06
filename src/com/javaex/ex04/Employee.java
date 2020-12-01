package com.javaex.ex04;

public class Employee extends User {

	private int salary;
	
	////////////////////////
	
	public Employee() {}

	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	
	
	
	///////////////////////////
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	////////////////////////////////////////////////
	
	@Override
	public String showInfo() {
		
		return super.showInfo()+", 월급:"+salary;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
}
