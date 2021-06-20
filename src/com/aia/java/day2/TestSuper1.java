package com.aia.java.day2;

public class TestSuper1 {
	public static void main(String[] args) {
		Dog d = new Dog();
		
		//super is used to refer immediate parent class instance variable
		d.printColor();
		
		//super can be used to invoke parent class method
		d.work();
	}
}
