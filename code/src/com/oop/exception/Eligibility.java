package com.oop.exception;

public class Eligibility {
	public static void eligible(int exp) {
		if(exp<10) {
			throw new ArithmeticException("This person is not eligible to be a senior system architech");
		}else {
			System.out.println("This person is eligible");
		}
	}

	public static void main(String[] args) {
		eligible(11);

	}

}
