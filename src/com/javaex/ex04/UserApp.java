package com.javaex.ex04;

import java.util.ArrayList;

public class UserApp {

	public static void main(String[] args) {
		
		
		ArrayList<User> user = new ArrayList<User>();
		
		
		user.add(new Customer("jws","j1234","정우성",1000));
		
		user.add(new Customer("yjs","y2345","이효리",2000));
		
		user.add(new Employee("master","m7788","운영자",5000000));
		
		for(User u : user) {
			System.out.println(u.showInfo());
		}
		
		Employee em = (Employee)user.get(2);
		
		System.out.println("운영자의 월급은 "+em.getSalary()+"입니다.");
		
		
		
		
		
		
		
		
		
		
		
	}

}
