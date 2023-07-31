package com.xworkz.main;

import com.xworkz.app.Browser;

public class BrowserRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in BrowserRunner");
		Browser browser=new Browser();
		browser.search();
		browser.issues();
	}

}
