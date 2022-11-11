package com.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

public class BeforeAndAfterTest {
	
	Calculator cal;
	
	@BeforeEach
	public void init() {
		cal=new Calculator();
		System.out.println("Before each method is being called right now");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("after each test case");
	}
	
	@Test
	@DisplayName("Addition of two numbers")
	public void testAddMethod() {
		int sum=cal.add(10, 100);
		assertEquals(110, sum);
		System.out.println("addition is:"+sum);
	}
	
	@Test
	@DisplayName("subtraction of two numbers")
	public void testSubMethod() {
		int sub=cal.sub(100, 10);
		assertEquals(90, sub);
		System.out.println("subtraction is:"+sub);
	}
	
	@Test
	@DisplayName("product of two numbers")
	public void testProductMethod() {
		int product=cal.product(5, 100);
		assertEquals(500, product);
		System.out.println("product is:"+product);
	}

}
