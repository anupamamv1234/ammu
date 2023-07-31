package com.xworkz.main;

import com.xworkz.app.Doctor;
import com.xworkz.app.Hospital;
import com.xworkz.app.Nurse;

public class HospitalRunner {
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.doctor();
		hospital.operation();
		Doctor doctor=new Doctor();
		doctor.checkup();
		doctor.qualification();
		Nurse nurse=new Nurse();
		nurse.name();
		nurse.injection();
	}

}
