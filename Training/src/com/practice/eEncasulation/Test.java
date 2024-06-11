package com.practice.eEncasulation;

public class Test {
	public static void main(String[] args) {
		Encapsulation ens = new Encapsulation();
		ens.setArea("Vizianagaram");
		ens.setDistrict("VZM");
		ens.setPincode(535003);
		
		System.out.println(ens.getArea()+" "+ens.getDistrict()+" "+ens.getPincode());
	}

}

