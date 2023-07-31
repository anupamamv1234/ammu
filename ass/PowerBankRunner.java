package com.xworkz.main;

import com.xworkz.app.PowerBank;

public class PowerBankRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in PowerBankRunner");
		PowerBank powerbank=new PowerBank();
		powerbank.company();
		powerbank.name();
	}
}
