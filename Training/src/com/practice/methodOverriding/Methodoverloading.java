package com.practice.methodOverriding;

public class Methodoverloading {
	
	int Pincode;
	Double Salary;
	String Address;
	String Orgnisation;
	
	public void Method(int pincode,String address) {
		this.Pincode = pincode;
		this.Address = address;
		
	}
	public void Method(Double salary,String organisation) {
		this.Salary = salary;
		this.Orgnisation = organisation;
	}
	public void printScreen() {
		System.out.println(Pincode+""+Address);
		System.out.println(Salary+""+Orgnisation);
	}
	public static void main(String[] args) {
		Methodoverloading obj1 = new Methodoverloading();
		obj1.Method(17.56,"Eidiko");
		obj1.Method(535003,"VZM");
		obj1.printScreen();
	}

}
