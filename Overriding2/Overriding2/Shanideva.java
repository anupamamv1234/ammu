package com.xworkz.Overriding2;

public class Shanideva extends Temple{
	@Override
	public void hope() {
		System.out.println("invoking hope method in Shanideva");
	}

	@Override
	public void hope(String name) {
		System.out.println("invoking hope method of String in Shanideva");
		hope(name);
	}

	@Override
	public void hope(String name, String location) {
		System.out.println("invoking hope method of String,String in Shanideva");
		hope(name, location);
	}

	@Override
	public void hope(String name, String location, String deity) {
		System.out.println("invoking hope method of String,String,String in Shanideva");
		hope(name, location, deity);
	}

	@Override
	public void hope(String name, String location, String deity, int capacity) {
		System.out.println("invoking hope method of String,String,String,int in Shanideva");
		hope(name, location, deity, capacity);
	}

	@Override
	public void hope(String name, String location, String deity, int capacity, boolean isPowerful) {
		System.out.println("invoking hope method of String,String,String,int,boolean in Shanideva");
	}

}
