package com.xworkz.app;

public class Hospital {
	public Doctor doctor;
	public void doctor() {
		if(this.doctor!=null) {
			this.doctor.checkup();
			System.out.println("invoking checkup in Hospital");
		}
		else {
			System.err.println("not invoking checkup in Hospital");
			
		}
	}
	public void operation() {
		if(this.doctor!=null) {
			this.doctor.qualification();
			System.out.println("invoking qualification in Hospital");
			
		}
		else {
			System.err.println("not invoking qualification in Hospital");
		}
	}

}
