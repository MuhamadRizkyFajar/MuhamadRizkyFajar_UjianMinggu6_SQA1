package com.juaracoding.shop_demoqa.utils;

public enum TestCase {
	
	T1("Test Create account"),
	T2("Test Login Account"),
	T3("Test Add Item to Cart"),
	T4("Test to Cart Page and Proceed to Checkout");
	
	private String testname;
	
	TestCase(String value) {
		this.testname=value;
	}

	public String getTestname() {
		return testname;
	}
	
}
