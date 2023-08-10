package EncapsulationMain;

import Encapsulationclass.RedBus;

public class RedBusRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in RedBuss killer");
		RedBus redBus=new RedBus();
		redBus.setTransport("in bus");
		System.out.println("transport in "+redBus.getTransport());
		redBus.setsize("Long");
		System.out.println("Size is "+redBus.getsize());
		redBus.setbodySize("Long");
		System.out.println("Body size "+redBus.getbodySize());
		redBus.setnoOfSeats(70);
		System.out.println("Total no of seats "+redBus.getnoOfSeats());
		redBus.setnoOfBenches(20);
		System.out.println("Total no of benches "+redBus.getnoOfBenches());
		redBus.settarget("Bangalore");
		System.out.println("Target is "+redBus.gettarget());
		redBus.setticketBooking("online mode");
		System.out.println("get ticket booking in "+redBus.getticketBooking());
		redBus.setonlineBooking("online booking for reservation");
		System.out.println("get ticket booking in "+redBus.getonlineBooking());
		redBus.setnoOfPassengers(80);
		System.out.println("Total no of Passenger "+redBus.getnoOfPassengers());
		redBus.setbetterRoads("For smooth traveling");
		System.out.println("Get betterr raods for "+redBus.getbetterRoads());
		redBus.setdistance(250);
		System.out.println("Total distance "+redBus.getdistance());
		redBus.settotalAmount(600);
		System.out.println("Total amount "+redBus.gettotalAmount());
		redBus.setgoogleMap("Hassan to bangalore");
		System.out.println("Roots "+redBus.getgoogleMap());
		
	}
}
