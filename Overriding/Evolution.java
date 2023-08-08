package Overriding;

public class Evolution extends Dinosaur{
	@Override
	public void walk() {
		System.out.println("Evolution overrides Dinosaur");
		super.walk();
	}

}
