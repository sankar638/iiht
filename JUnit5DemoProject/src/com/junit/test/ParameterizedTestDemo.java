package com.junit.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {

//	@ValueSource
//	@EnumSource
//	@MethodSource
//	@CsvSource
//	@CsvFileSource
//	@ArgumentsSource

	@ParameterizedTest(name = "{index} - Run with args = {0}")
	@ValueSource(ints = { 1, 5, 3, 7 })
	public void valueSourceTest(int args) {
		System.out.println(args);
	}

	// ------enumsource

	enum TV {
		LG, Samsung, Toshiba;
	}

	@ParameterizedTest
	@EnumSource(TV.class)
	public void enumSourceTest(TV tv) {
		System.out.println(tv);
	}

	// ====methodsource===

	public static String[] cars() {
		return new String[] { "Maruthi", "swift", "honda" };
	}

	@ParameterizedTest
	@MethodSource("cars")
	public void methodSourceTest(String cars) {
		System.out.println(cars);
	}
	
	//-------Csvsource
	
	@ParameterizedTest
	@CsvSource({"siva","nag","hari","sai"})
	public void csvSourceTest(String name) {
		System.out.println(name);
	}

}
