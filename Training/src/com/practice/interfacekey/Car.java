package com.practice.interfacekey;

public class Car implements Transportation{
	public void journey() {
		System.out.println("Have a safe journey");
	}
	public static void main(String[] args) {
		Car obj1 = new Car();
		obj1.journey();
		
	}

}
