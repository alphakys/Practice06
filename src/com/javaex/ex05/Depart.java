package com.javaex.ex05;

public class Depart extends Employee{
	
	
	private String department;
	
	//////////////////////////////
	public Depart(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

	
	
/////////////////////////////////////////////
	
	
	
	public void getInformation() {
		
		System.out.println("이름:" + name + "   연봉:" + salary+"  부서:"+department);
	}
	
	
	
	
	
	
	
	
	
	
}
