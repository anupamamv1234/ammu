package Overriding;

public class BestCoal extends Coal{
	@Override
	public void burn() {
		System.out.println("BestCoal overrides Coal ");
		super.burn();
	}

}
