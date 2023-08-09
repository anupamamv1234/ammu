package com.xworkz.Overriding2;

public class TempleRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in TempleRunner");

		Temple temple = new Shanideva();
		temple.hope();
		System.out.println("************Child ref*************");
		Shanideva ganeshaTemple = new Shanideva();
		ganeshaTemple.hope();
	}

}
