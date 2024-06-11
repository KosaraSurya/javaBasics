package com.practice.interfacePrac;

public class Logistics implements Sampleinterface {
	
	public void vehicle() {
		System.out.println("method calling successfully");
		
	}
	
	public static void main(String[] args) {
		Logistics obj1 = new Logistics();
		obj1.vehicle();
	}

}
