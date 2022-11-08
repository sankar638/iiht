package com.oop;

public class Emp {
	int baseSalary=50000;
	
	void totalSalary (int bs,int  bonus ) {
		int total=bs+bonus;
		System.out.println(total);
	}
	
	void totalSalary (int bs,int  bonus, int insentive ) {
		int total=bs+bonus+insentive;
		System.out.println(total);
	}
	
	void working() {
		System.out.println("Employee is working");
	}

}
