package com.oop.abstraction;

public class Csk extends Ipl{

	@Override
	void play() {
		System.out.println("Csk is playing good.");
		
	}
	
	public static void main(String args[]) {
		Csk obj=new Csk();
		obj.play();
		
	}

}
