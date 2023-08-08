package Overriding;

public class GoldBangle extends Bangle{
	@Override
	public void sound() {
		System.out.println("GoldBangle overrides Bangle");
		super.sound();
	}

}
