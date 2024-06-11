package com.practice.methodsVariables;

public class Classtwo {
	public static void main(String[] args) {
		
		//Static members(static methods and static variables) can be accessed from another class
		//by using class name
		Classone.demoStatic();
		System.out.println(Classone.name);
		
		//Non static members(non static methods and non static variables)can be accessed from
		//another class by using object
		Classone obj1 = new Classone();
		obj1.demo();
		System.out.println(obj1.id);
	}

}
