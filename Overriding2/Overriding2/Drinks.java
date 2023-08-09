package com.xworkz.Overriding2;

public class Drinks extends Pub{
	@Override
	public void enjoy() {
		System.out.println("invoking enjoy method in Drinks");
		enjoy(name);
	}

	@Override
	public void enjoy(String name) {
		System.out.println("invoking enjoy method of String in Drinks");
		enjoy(name, location);
	}

	@Override
	public void enjoy(String name, String location) {
		System.out.println("invoking enjoy method of String,String in Drinks");
		enjoy(name, location, capacity);
	}

	@Override
	public void enjoy(String name, String location, int capacity) {
		System.out.println("invoking enjoy method of String,String,int in Drinks");
		enjoy(name, location, capacity, servesFood);
	}

	@Override
	public void enjoy(String name, String location, int capacity, boolean servesFood) {
		System.out.println("invoking enjoy method of String,String,int,boolean in Drinks");
		enjoy(name, location, capacity, servesFood, pubType);
	}

}
