package com.xworkz.app;

public class Building {
	public Floor[] floors;
	public Lift[] lifts;
	public Building(Floor[] floors,Lift[]lift) {
		this.floors=floors;
		this.lifts=lifts;
	}
	public void printInfo() {
		for(int index=0;index<floors.length;index++) {
			Floor ref=floors[index];
			ref.printInfo();
		}
		for(int index=0;index<lifts.lenth;index++) {
			Lift ref=lifts[index];
			ref.printInfo();
		}
	}

}
