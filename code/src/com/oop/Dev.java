package com.oop;

public class Dev extends Emp {
	int bonus=25000;
	int total=baseSalary+bonus;

	public static void main(String[] args) {
		
		Dev nishant=new Dev();
		System.out.println("Total salary of nishanth is:"+nishant.total);

	}

}
