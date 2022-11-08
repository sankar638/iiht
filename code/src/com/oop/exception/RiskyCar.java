package com.oop.exception;

import java.io.IOException;

class car1 {
	void breakDown() throws IOException {
		throw new IOException("this car is break down");
	}
}

public class RiskyCar {

	public static void main(String[] args) {
		try {
			car1 c1 = new car1();
			c1.breakDown();
		} catch (Exception e) {
			System.out.println("Exception handled " + e);
		}

		System.out.println("continue..");

	}

}
