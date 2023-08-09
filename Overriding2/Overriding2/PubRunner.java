package com.xworkz.Overriding2;

public class PubRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in PubRunner");

		Pub pub = new Pub();
		pub.enjoy();
		System.out.println("********Child ref**********");

		Pub sportsPub = new Drinks();
		sportsPub.enjoy();
	}

}
