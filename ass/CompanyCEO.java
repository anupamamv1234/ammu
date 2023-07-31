package com.xworkz.app;

public abstract class CompanyCEO {
	public String name;
	public String ceo;
	public String originCountry;
	
	public CompanyCEO(String name,String ceo,String originCountry) {
		this.name=name;
		this.ceo=ceo;
		this.originCountry=originCountry;
	}
	public void printInfo() {
		System.out.println("name"+this.name);
		System.out.println("ceo"+this.ceo);
		System.out.println("originCountry"+this.originCountry);
		}
}
