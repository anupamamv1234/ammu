package com.xworkz.app;

public class Watchman {
	public Gun gun;
	void secure()
	{
		System.out.println("invoking in secure");
		this.gun.shoot();
	}

}
