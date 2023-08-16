package AbstractMain;

import Abstract.Airoplane;
import Abstract.Airport;

public class AirportRunner {
	public static void main(String[] args) {
		Airport airport=new Airoplane();
		airport.baggageHandling();
		airport.control();
		airport.emergenchServices();
		airport.foodServices();
		airport.hangars();
		airport.lounges();
		airport.restaurants();
		airport.security();
		airport.taxiWays();
	}


}
