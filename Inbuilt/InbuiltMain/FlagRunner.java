package com.xworkz.InbuiltMain;

import com.sun.tools.doclint.Checker.Flag;

public class FlagRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in flag runner");
		Flag flag = new Flag();
		System.out.println(flag.toString());
		Flag flag1 = new Flags("orange white green", 3, "India");
		System.out.println(flag1);
		Flag flag2 = new Flag("red white blue", 3, "Australia");
		System.out.println(flag2);

	}
}
