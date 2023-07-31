package com.xworkz.main;

import com.xworkz.app.Ingredent;
import com.xworkz.app.Toothpaste;

public class ToothpasteRunner {

	public static void main(String[] args) {
		System.out.println("invoking the main in ToothpasteRunner");
		System.out.println("invoking the tooth paste in ToothpasteRunner");
		String name="DaburRed";
		String brand="DaburRed";
		CompanyCEO company=new CompanyCEO("Dabur","Theja","India");
		Ingredent ingredent1=new Ingredent("Sorabito",54,86f);
		Ingredent ingredent2=new Ingredent("a",64,71f);
		Ingredent ingredent3=new Ingredent("Sulfate",45,96f);
		Ingredent ingredent4=new Ingredent("Sorabito",59,76f);
		Ingredent ingredent5=new Ingredent("Cellilose",63,80f);
		Ingredent[] ingredent= {ingredent1,ingredent2,ingredent3,ingredent4,ingredent5}
		Toothpaste toothpaste=new Toothpaste(name,brand,company,ingredent);
		toothpaste.printInfo();
		company.printInfo();
	}

}
