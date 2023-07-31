package com.xworkz.app;

public class Players {
public Building building;
public String name;
public String exp;
public HomeTown town;
public Players(Building building,String name,String exp,HomeTown town) {
	this.building=building;
	this.name=name;
	this.exp=exp;
	this.town=town;
}
public Players(String string,int i,HomeTown town2,Building building) {
}
public void printInfo() {
	System.out.println("Building"+building);
	System.out.println("Name"+name);
	System.out.println("Exp"+building);
	System.out.println("Town"+town);
}
}
