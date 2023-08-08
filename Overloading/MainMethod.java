package com.xworkz.Overloading;

public class MainMethod {
	public static void main(String[] args) {
		IronBox ironBox=new IronBox();
		ironBox.temperature();
		ironBox.temperature(3000,true);
		System.out.println("-----------------------------");
		Hotel hotel=new Hotel();
		hotel.service();
		hotel.service("Dosa", 90);
		System.out.println("-----------------------------");
		Specs specs=new Specs();
		specs.lens();
		specs.lens("Concave", 4000);
		System.out.println("-----------------------------");
		Umbrella umbrella=new Umbrella();
		umbrella.protectFromRain();
		umbrella.protectFromRain("White", 1000);
		System.out.println("-----------------------------");
		Stapler stapler=new Stapler();
		stapler.join();
		stapler.join("Metallic", 500);
		System.out.println("-----------------------------");
		Ladder ladder=new Ladder();
		ladder.climb();
		ladder.climb("Straight ladder", 40);
		System.out.println("-----------------------------");
		Gadget gadget=new Gadget();
		gadget.display();
		gadget.display("Laptop", 60000);
		System.out.println("-----------------------------");
		Plier plier=new Plier();
		plier.cutting();
		plier.cutting("Tool", 700);
		System.out.println("-----------------------------");
		Mouse mouse=new Mouse();
		mouse.movement();
		mouse.movement(3, false);
		System.out.println("-----------------------------");
		Elevator elevator=new Elevator();
		elevator.move();
		elevator.move("carry", 450);
	}
}
