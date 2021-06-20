package com.aia.java.day1;

import com.aia.java.day2.Test2;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Guru guru = new Guru("Hari", "1234");
		System.out.println(guru.name + " " + guru.nip);
		
		//inheritance
		Mamalia mamalia = new Mamalia();
		System.out.println(mamalia.color);
		
		Tiger tiger = new Tiger();
		System.out.println(tiger.color);
	}
}
