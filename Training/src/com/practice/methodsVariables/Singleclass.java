package com.practice.methodsVariables;

public class Singleclass {
	
	int age = 25;
	static String occupaiton = "Doctor";
	
	public static void demo() {
		System.out.println("Static method");
	}
	public void demoMethod() {
		System.out.println("non static method");
	}
	
	public static void main(String[] args) {
		demo();
		System.out.println(occupaiton);
		
		Singleclass obj1 = new Singleclass();
		obj1.demoMethod();
		System.out.println(obj1.age);
	}

}
