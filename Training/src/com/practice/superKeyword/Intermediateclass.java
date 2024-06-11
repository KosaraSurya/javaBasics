package com.practice.superKeyword;

public class Intermediateclass extends Sampleclass{
	
	public Intermediateclass(int id,String name) {
		super(id,name);
	}




	public void demo(Intermediateclass inter) {
		System.out.println("The ID of the person "+" "+inter.id);
		System.out.println("The Name of the person"+" "+inter.name);
	}

}
