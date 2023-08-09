package com.xworkz.Overriding2;

public class CityRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in CityRunner");

		City city = new City();
		city.welcome();
		System.out.println("***********Child ref***************");
		City city1 = new Villages();
		city1.welcome();
	}
}
