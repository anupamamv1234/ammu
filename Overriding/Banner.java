package Overriding;

public class Banner extends Flex{
	@Override
	public void display() {
		System.out.println("Banner overrides Flex");
		super.display();
	}
	
}
