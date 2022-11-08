package com.oop;

public class Student {
	
	int id;
	String name;
	Address address;
	void addStudent(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void displayStudent() {
		System.out.println(name+" "+address.city+" "+address.country);
	}
	
	public static void main(String args[]) {
		Address add =new Address("Bangalore", "KT", "Ind");
		
		Student stu=new Student();
		stu.addStudent(101, "siva", add);
		stu.displayStudent();
	}
	 
	
	

}
