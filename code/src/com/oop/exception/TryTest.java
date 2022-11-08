package com.oop.exception;

public class TryTest {

	public static void main(String[] args) {
		try {
			int num=100/0;
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		
		System.out.println("continue the rest of the code.");

	}

}
