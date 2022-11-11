package com.junit.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

public class CalculatorTest {

	@Test
	@DisplayName("Addition of two numbers")
	public void testAddMethod() {
		Calculator cal=new Calculator();
		int sum=cal.add(10, 100);
		assertEquals(110, sum);
		System.out.println("addition is:"+sum);
	}
	
	@Test
	@DisplayName("subtraction of two numbers")
	public void testSubMethod() {
		Calculator cal=new Calculator();
		int sub=cal.sub(100, 10);
		assertEquals(90, sub);
		System.out.println("subtraction is:"+sub);
	}
	
	@Test
	@DisplayName("product of two numbers")
	public void testProductMethod() {
		Calculator cal=new Calculator();
		int product=cal.product(5, 100);
		assertEquals(500, product);
		System.out.println("product is:"+product);
	}
	

}
