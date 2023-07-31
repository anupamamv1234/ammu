package com.xworkz.main;

import com.xworkz.app.Shop;

public class ShopRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in ShopRunner");
		Shop.shop=new Shop();
		shop.company();
		shop.location();
	}

}
