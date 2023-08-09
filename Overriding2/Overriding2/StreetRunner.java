package com.xworkz.Overriding2;

public class StreetRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in StreetRunner");

		Street street = new Street();
		street.addLandMark();
		System.out.println("***********Child ref************");
		Street street1 = new StreetFood();
		street1.addLandMark();
	}
}
