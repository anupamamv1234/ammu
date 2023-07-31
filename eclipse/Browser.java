package com.xworkz.app;

public class Browser {
	public Internet internet;
	public void search() {
		if(this.internet!=null) {
			this.internet.connect();
			System.out.println("invoking connect in Browser");
		}
		else {
			System.err.println("not invoking connect in Browser");
		}
	}
public void issues() {
	if(this.internet!=null) {
		this.internet.data();
		System.out.println("invoking usage in Browser");
	}
	else {
		System.err.println("not invoking usage in Browser");
	}
}
}