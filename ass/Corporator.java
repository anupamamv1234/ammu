package com.xworkz.app;

public class Corporator {
	public String name;
	public Building[] building;
	public Corporator(String name,Building[] building)
	this.name=name;
	this.building=building;
}
	public void printInfo() {
		System.out.println("name"+name);
		for(int index=0;index<building.length;index++) {
			Building ref=building[index];
			ref.printInfo();
		}
	}
