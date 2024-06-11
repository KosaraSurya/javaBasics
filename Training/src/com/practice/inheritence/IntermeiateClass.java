package com.practice.inheritence;

public class IntermeiateClass extends Childclass{
	
	public IntermeiateClass(int mobile,String gender,String name,String organisation) {
		super(name,organisation);
		this.Mobile = mobile;
		this.Gender = gender;
	}
	public void printMethod() {
		System.out.println("\n"+Mobile+"\n"+Gender+"\n"+Name+"\n"+Organisation);
		
	}

}
