package com.xworkz.app;

public class HomeTown {
public String name;
public int pinCode;
public Area[] areas;
public HomeTown(String name,int pinCode,Area[] areas) {
	this.name=name;
	this.pinCode=pinCode;
	this.areas=areas;
}
public void printInfo() {
	System.out.println("Name"+name);
	System.out.println("PinCode"+pincode);
	for(int index=pinCode;index<areas.length;index++) {
		Area ref=areas[index];
		ref.printInfo();
	}
}
}
