package com.xworkz.app;

public class Ingredent {
	public String name;
	public int quantity;
	public int cost;
	
	public Ingredent(String name,int quantity,int cost) {
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
	}
	public void printInfo() {
		System.out.println("name"+this.name);
		System.out.println("quantity"+this.quantity);
		System.out.println("cost"+this.cost);
		}
}

