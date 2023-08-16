package AbstractMain;

import Abstract.Highway;
import Abstract.NationalHighway;

public class HighwayRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in highway runner");
		Highway highway = new NationalHighway();
		highway.code();
		highway.distance();
		highway.highwayMan();
		highway.petrol();
		highway.running();
		highway.system();
		highway.tollCollection();
		highway.travel();
	}

}
