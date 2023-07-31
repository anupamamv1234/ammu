package com.xworkz.app;

public class PowerBank {
	public Battery battery;
	public void company() {
		if(this.battery!=null) {
			this.battery.brand();
			System.out.println("invoking brand in Powerbank");
		}
		else {
			System.err.println("not invoking brand in Powerbank");
		}
	}
	public void name() {
		if(this.battery!=null) {
			this.battery.features();
			System.out.println("invoking features in Powerbank");
		}
		else {
			System.err.println("not invoking features in Powerbank");
		}
	}
}
