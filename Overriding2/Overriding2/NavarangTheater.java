package com.xworkz.Overriding2;

public class NavarangTheater extends Theater {
	@Override
	public void display() {
		System.out.println("invoking dispaly method in NavarangTheater");
	
	}

	@Override
	public void display(String name) {
		System.out.println("invoking dispaly method of String  in NavarangTheater");
		display(name);
	}

	@Override
	public void display(String name, String area) {
		System.out.println("invoking dispaly method of String,String in NavarangTheater");
		display(name, area);
	}

	@Override
	public void display(String name, String area, String currentMovie) {
		System.out.println("invoking dispaly method of String,String,String in NavarangTheater");
		display(name, area, currentMovie);
	}

	@Override
	public void display(String name, String area, String currentMovie, int ticketPrice) {
		System.out.println("invoking dispaly method of String,String,String,int in NavarangTheater");
		display(name, area, currentMovie, ticketPrice);
	}

	@Override
	public void display(String name, String area, String currentMovie, int ticketPrice, boolean isThereAc) {
		System.out.println("invoking dispaly method of String,String,String,int,boolean in NavarangTheater");
	}

}
