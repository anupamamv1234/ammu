package com.xworkz.app;

public class Doctor {
	public Nurse nurse;
	public void checkup() {
		if(this.nurse!=null) {
		this.nurse.checkup();
		System.out.println("invoking checkup in Hospital");
		}
		else {
		System.out.println("not invoking checkup in Hospital");	
		}
	}
		
	
	public void operation() {
		
		if(this.nurse!=null) {
			this.nurse.qualification();
			System.out.println("invking qualification in Hospital");
		}
		else {
			System.err.println("not invoking qualification in Hospital");
		}
	}
		
	}
	


