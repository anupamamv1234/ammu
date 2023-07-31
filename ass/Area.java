package com.xworkz.app;

public class Area {
	public String name;
	public Corporator corporator;
	public Area(String name,Corporator corporator) {
		this.name=name;
		this.corporator=corporator;
	}
	public void println() {
		System.out.println("Name"+name);
		System.out.println("Corporator"+corporator);
		
	}

}
