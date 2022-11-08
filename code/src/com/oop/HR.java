package com.oop;

public class HR extends Emp {

	int bonus=15000;
	//int total=baseSalary+bonus;

	public static void main(String[] args) {
		
		HR aisha=new HR();
		aisha.totalSalary(aisha.bonus, aisha.baseSalary);
		
		//System.out.println("Total salary of nishanth is:"+aisha.total);


	}
}
