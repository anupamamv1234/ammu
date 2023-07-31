package com.xworkz.app;

public class Shop {
public Salesman salesman;
public void company() {
	if(this.salesman!=null) {
		this.salesman.selling();
		System.out.println("invoking selling in Shop");
	}
	else {
		System.err.println("not invoking selling in Shop");
		
	}
}
public void location() {
	if(this.salesman!=null) {
		this.salesman.products();
		System.out.println("invoking products in Shop");
		
	}
	else {
		System.err.println("not invoking products in Shop");
	}
}
}
