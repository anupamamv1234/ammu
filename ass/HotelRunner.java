package com.xworkz.main;

import com.xworkz.app.Hotel;

public class HotelRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in HotelRunner");
		Hotel hotel=new Hotel();
		hotel.shop();
		hotel.location();
	}

}
