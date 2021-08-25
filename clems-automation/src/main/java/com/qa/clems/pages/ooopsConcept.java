package com.qa.clems.pages;

public class ooopsConcept {

	public static void main(String[] args) {
// we can not over ride a static method but we can overload it.
		// Over ride : same name,same sign , same number and type of arguments, child class , it will be method hiding
		// Over load: same name , different number / type of arguments, same class
		// To access a no static method we need to create an object of that class
		// to access a static method we can call that class directly by it's class neme
		// main is a static method and it can be over loaded, but jvm will still be looking for strg arg[]... argument.
		// you can access a non static method from a non static method directly.
		// you can access a static method from a static method directly
		// static method can only access static members
		// a non static method can access both static and non static members of the class.
		// Interface: can not be instantiated,No Object, No method body, only declaration, can have variables (Static in nature- will be called only through the interface name.)
		// Interface: 100% abstraction, a class can implements multiple interfaces. can refer to it's child's object. ie...  interFaceName in = new ChildClassname(); and can call it's methods and variables.
		// Abstract class, 0-100% abstraction, key word Abstract is used to make abstract, can have non abstract methods as well. No object of an abstract class can be created
		// constructor: same name as class name, use to instantiate the methods, it initialize the member data / methods needs to be initiated.When an object is created (zero args)default constructor is called. if there is no constructor is created by the coder, java will create default (zero argument) constructor, if coder creates any constructor, java will not create any constructor and if coder needs a zero argument constructor he/she will have to define it themselves . When the child class has it's constructor called, parent class constructor will be called first
		// Final : if anything is Final, it can not be overridden, extended.
		// creating an object of child class BMW
		BMW bmw = new BMW();
		bmw.start();// since bmw overridden this method, child class start method will be called
		bmw.refule();// parent class refuel method will be called
		parentCar.stop();// parent class stop method is static
		bmw.stop();// trying to access a static method with object call, warning
		BMW.stop();// calling a static method with the name of the class, static memory is not saved under object , it saved in a common location
	}

}
