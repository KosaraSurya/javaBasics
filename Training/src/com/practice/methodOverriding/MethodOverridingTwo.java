package com.practice.methodOverriding;

public class MethodOverridingTwo extends MethodOverriding {
	public void method() {
		System.out.println("Hai Hello Namasthe");
	}
	public static void main(String[] args) {
		MethodOverridingTwo obj1 = new MethodOverridingTwo();
		obj1.method();
	}

}
