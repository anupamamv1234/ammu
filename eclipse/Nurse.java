package com.xworkz.app;

public class Nurse {
	public Patient patient;
	public void name() {
		if(this.patient!=null) {
			this.patient.tablet();
			System.out.println("invoking tablet in Nurse");
		}
		else {
			System.err.println("not invoking tablet in Nurse");	
		}
	}
	public void injection() {
		if(this.patient!=null) {
			this.patient.disease();
			System.out.println("invoking disease in Nurse");
		}
		else {
			System.err.println("not invoking disease in Nurse");
		}
	}
}
