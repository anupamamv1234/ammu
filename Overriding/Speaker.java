package Overriding;

public class Speaker extends Mic{
	@Override
	public void sound() {
		System.out.println("Speaker overrides Mic");
		super.sound();
	}

}
