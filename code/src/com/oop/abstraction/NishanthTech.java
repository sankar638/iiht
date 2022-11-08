package com.oop.abstraction;

public class NishanthTech implements ITCompanies {

	@Override
	public void working() {
		System.out.println("nishanth tech is working on java project.");
		
	}
	
	public static void main(String[] args) {
		
		NishanthTech nt=new NishanthTech();
		nt.working();

	}

}
