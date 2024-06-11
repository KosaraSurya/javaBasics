package com.practice.constrictor;

public class ConstructorChaining {
	int personId;
	String personName;
	String personPlace;
	String perosnAddress;
	public ConstructorChaining(int id,String name,String place,String address) {
		this(place,address);
		personId = id;
		personName = name;
	}
	public ConstructorChaining(String place,String address) {
		personPlace = place;
		perosnAddress = address;
	}
	public static void main(String[] args) {
		
		ConstructorChaining obj1 = new ConstructorChaining(79,"srinivas", "vzm", "AP");
		System.out.println(obj1.personId+" "+obj1.personName+" "+obj1.personPlace+" "+obj1.perosnAddress);
		
		
	}

}
