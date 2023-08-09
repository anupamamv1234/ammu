package com.xworkz.Overriding2;

public class MarketRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in MarketRunner");

		Market market = new Market();
		
		System.out.println("*********Child ref*************");
		Market fishMarket = new FishMarket();
		fishMarket.sell();
	}
}
