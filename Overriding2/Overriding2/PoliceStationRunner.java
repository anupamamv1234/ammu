package com.xworkz.Overriding2;

public class PoliceStationRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in PoliceStationRunner");

		PoliceStation policeStation = new PoliceStation();
		policeStation.arrest();
		System.out.println("*********Child ref**********");

		PoliceStation policeStation1 = new Police();
		policeStation1.arrest();
	}
}
