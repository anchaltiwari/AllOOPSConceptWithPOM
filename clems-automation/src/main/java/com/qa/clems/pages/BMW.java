package com.qa.clems.pages;

public class BMW extends parentCar {
	// over riding of non static method is permitted
	@Override
	public void start() {
		System.out.println("BMW start");
	}
	// static method can not be overridden
	// method hiding
	public static void stop() {
		System.out.println("BMW stop");
		
	}

}
