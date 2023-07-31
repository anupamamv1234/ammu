package com.xworkz.app;

public class Toothpaste {
	public String name;
	public String brand;
	public String company;
	public Ingredent[] ingredent;
	
	public Toothpaste(String name,String brand,String company,Ingredent[] ingredent) {
		this.name=name;
		this.brand=brand;
		this.company=company;
		this.ingredent=ingredent;
	}
	public void printInfo() {
		System.out.println("info of Toothpaste");
		System.out.println("name of the Toothpaste"+this.name);
		System.out.println("name of the brand"+this.brand);
		System.out.println("name of the company"+this.company);
		for(int index=0;index<this.ingredent.length;index++) {
			Ingredent ref=ingredent[index];
			ref.printInfo();
		}
	}
	
}
