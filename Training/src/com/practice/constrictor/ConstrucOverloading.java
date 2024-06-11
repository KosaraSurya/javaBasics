package com.practice.constrictor;

public class ConstrucOverloading {
	int studentAge;
	String studentName;
	String stuentPlace;
	public static void main(String[] args) {
		new ConstrucOverloading(57,"eidiko");
		new ConstrucOverloading("hyd");
	}
	public ConstrucOverloading(int age,String name) {
		 studentAge = age;
		 studentName = name;
		 System.out.println(age+" "+name);
	}
	public ConstrucOverloading(String place) {
		 studentName = place;
		 System.out.println(place);
	}

}
