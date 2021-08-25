package com.qa.clems.pages;

public class parentCar {
	// non static
	public void start() {
		System.out.println("parent class car Start method .");
	}
	//static method
	public static void stop() {
		System.out.println("parent class car stop method .");
	}
	public void refule() {
		System.out.println("Parent class car refule");
	}
	// Over loading 
	public void refule(int s, int y) {
		System.out.println("Parent class car refule");
	}
	// Over loading 
	public void refule(int s, String y) {
		System.out.println("Parent class car refule");
	}

}
