package com.oop;

public class Sales extends Emp {
	
	int bonus=15000;
	int insentive;
	//int total=baseSalary+bonus;
	
	void working() {
		System.out.println("Employee is a part of sales team.");
	}

	public static void main(String[] args) {
		
		Sales ashish=new Sales();
		ashish.insentive=2000;
		ashish.totalSalary(ashish.bonus, ashish.baseSalary,ashish.insentive);
		
		//System.out.println("Total salary of nishanth is:"+aisha.total);
		ashish.working();


	}

}
