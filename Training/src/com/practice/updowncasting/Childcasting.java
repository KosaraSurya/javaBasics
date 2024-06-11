package com.practice.updowncasting;

public class Childcasting extends Casting {
	public void secondMethod() {
		System.out.println("this is second method");
		
	}
	public static void main(String[] args) {
		Casting obj1 = new Childcasting();
		obj1.sampleMethod();//upcasting
		
		Childcasting obj2 = (Childcasting)obj1;//downcasting
		obj2.secondMethod();
	}

}
