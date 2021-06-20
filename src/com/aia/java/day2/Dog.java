package com.aia.java.day2;

public class Dog extends Animal {
	String color = "black";
	
	Dog() {
//		super();
		System.out.println("Dog is created");
	}
	
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
	void eat() {
		System.out.println("eating bread...");
	}
	
	void bark() {
		System.out.println("barking...");
	}
	
	void work() {
		super.eat();
		bark();
	}
}
